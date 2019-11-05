package com.xzh.clothes.UserModule;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.xzh.clothes.command.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author ：xiaonuolen
 * @date ：Created in 2019/11/5 10:16
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private UserService userServiceImpl;


    @RequestMapping(value = "/query")
    public Message query(){
        PageHelper.startPage(1,1);
        List<UserDo> userDos = userServiceImpl.queryUser("", "");
        PageInfo<UserDo> userDoPageInfo = new PageInfo<>(userDos);
        Message message = new Message(0,"suceess",userDoPageInfo);
        System.out.println(message);
        return message;
    }

    @RequestMapping(value = "/insert")
    public String insert(){
        Message message = new Message();
        UserDo userDo = new UserDo();
        userDo.setUserAddress("11111111");
        userDo.setUserName("sgw1232");
        userDo.setUserPhone("sgw1231");
        BigDecimal bigDecimal = new BigDecimal(11.55);
        userDo.setUserMoney(bigDecimal);
        Integer integer = 0;
        try{
            integer = userServiceImpl.addUser(userDo);
            message.setMessage("success");
            message.setState(1);
            message.setData(null);
        }catch (Exception e){
            String messageInfo = "";
            if(e.getMessage().contains("name")){
                messageInfo = "名字重复了！";
            }
            else if(e.getMessage().contains("phone")){
                messageInfo = "手机号重复了！";
            }
            else{
                messageInfo = "未知异常，请联系管理员！";
            }
            message.setMessage(messageInfo);
            message.setState(1);
            message.setData(null);
        }



        return message.toString();
    }
}
