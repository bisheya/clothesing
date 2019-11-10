package com.xzh.clothes.shopCarModule;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzh.clothes.CommodityModule.CommodityDo;
import com.xzh.clothes.command.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(value = "/shopCar")
public class ShopCarController {

    @Autowired
    private ShopCarService shopCarServiceImpl;

    @RequestMapping(value = "/queryShopCar")
    public Message queryShopCar(int  userId, @RequestParam(value = "page" ) Integer page,
                                  @RequestParam(value = "size")Integer size){
        PageHelper.startPage(page,size);
        int commodityId = 0;
        String commodityBrand = "";
        Message message;
        if(userId != 0){
            message = new Message(1,"success","用户id为空");
        } else {
            List<CommodityDo> commodityDos = shopCarServiceImpl.queryShopList(userId);
            PageInfo<CommodityDo> commodityDoPageInfo = new PageInfo<>(commodityDos);
            message = new Message(0,"success",commodityDoPageInfo);
        }
        return message;
    }

    @RequestMapping(value = "/deleteShopCar")
    public Message deleteShopCar(int userId,int shopList){
        Message message;
        Integer integer=shopCarServiceImpl.deleteShopList(userId,shopList);
        message=new Message(integer==0?1:0,"success",integer);

        return message;
    }

    @RequestMapping(value = "/insertShopCar")
    public Message insertShopCar(@RequestBody ShopCarDo shopCarDo){
        Message message = new Message();
        Integer integer = 0;
        try{
            integer = shopCarServiceImpl.insertCommodity(shopCarDo);
            message.setMessage("success");
            message.setState(0);
            message.setData(integer);
        }catch (Exception e){
            System.out.println(e);
            String messageInfo = "未知异常 联系管理员";
            message.setMessage(messageInfo);
            message.setState(1);
            message.setData(null);
        }

        return message;
    }

}
