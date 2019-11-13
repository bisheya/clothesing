package com.xzh.clothes.Trade;

import com.github.pagehelper.PageInfo;
import com.xzh.clothes.command.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/trade")
public class TradeController {

    @Autowired
    private TradeService tradeServiceImpl;

    @RequestMapping(value = "/insertTrade")
    public Message insertTrade(@RequestBody TradeDo tradeDo) {
        Message message = new Message();
        Integer integer = 0;
        try {
            integer = tradeServiceImpl.addTrade(tradeDo);
            message.setMessage("success");
            message.setState(0);
            message.setData(integer);
        } catch (Exception e) {
            System.out.println(e);
            String messageInfo = "未知异常 联系管理员";
            message.setMessage(messageInfo);
            message.setState(1);
            message.setData(null);
        }

        return message;
    }

    @RequestMapping(value = "/queryTrade")
    public Message queryTrade(@RequestParam(value = "userId") int userId, @RequestParam(value = "tradeState") int tradeState) {

        int commodityId = 0;
        String commodityBrand = "";
        Message message;
        if (userId == 0) {
            message = new Message(1, "success", "用户id为空");
        } else {
            List<TradeDo> commodityDos = tradeServiceImpl.queryTrade(userId, tradeState);
            message = new Message(0, "success", commodityDos);
        }
        return message;
    }

    @RequestMapping(value = "/deleteTrade")
    public Message deleteTrade(@RequestBody TradeDo tradeDo) {
        Message message;
        Integer integer=tradeServiceImpl.deleteTrade(tradeDo);
        message=new Message(integer==0?1:0,"success",integer);
        return message;
    }

    @RequestMapping(value = "/updateTrade")
    public Message updateTrade(@RequestBody TradeDo tradeDo) {
        Message message;
        Integer integer=tradeServiceImpl.updateTrade(tradeDo);
        message=new Message(integer==0?1:0,"success",integer);
        return message;
    }

}
