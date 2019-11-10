package com.xzh.clothes.CommodityModule;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzh.clothes.command.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityServiceImpl;

    @RequestMapping(value = "/queryCommodity")
    public Message queryCommodity(@RequestBody(required = false) CommodityDo commodityDo, @RequestParam(value = "page" ) Integer page,
                             @RequestParam(value = "size")Integer size){

        PageHelper.startPage(page,size);
        System.out.println(commodityDo);
        int commodityId = 0;
        String commodityBrand = "";
        if(commodityDo!=null){
            commodityId = commodityDo.getCommodityId();
            commodityBrand = commodityDo.getCommodityBrand();
        }
        List<CommodityDo> commodityDos = commodityServiceImpl.queryCommodity(commodityId,commodityBrand);
        PageInfo<CommodityDo> commodityDoPageInfo = new PageInfo<>(commodityDos);
        Message message = new Message(0,"success",commodityDoPageInfo);

        return message;
    }

    @RequestMapping(value = "/insertCommodity")
    public Message insertCommodity(@RequestBody CommodityDo commodityDo){
        Message message = new Message();
        Integer integer = 0;
        try{
            integer = commodityServiceImpl.insertCommodity(commodityDo);
            message.setMessage("success");
            message.setState(0);
            message.setData(integer);
        } catch (Exception e){
            String messageInfo = "未知异常 联系管理员";
            if(e.getMessage().contains("commodityId")){
                messageInfo =  "商品编号重复";
            }
            message.setMessage(messageInfo);
            message.setState(1);
            message.setData(null);
        }
        return message;
    }

    @RequestMapping(value = "/deleteCommodity")
    public Message  deleteCommodity(int commodityId){
        Message message;
        Integer integer= commodityServiceImpl.deleteCommodity(commodityId);
        message=new Message(integer==0?1:0,"success",integer);

        return message;
    }

    @RequestMapping(value = "/updeteCommodity")
    public Message  updeteUser(@RequestBody CommodityDo commodityDo){
        Message message;
        Integer integer = commodityServiceImpl.updateCommodity(commodityDo);
        message=new Message(integer==0?1:0,"success",integer);

        return message;
    }

}
