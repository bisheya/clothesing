package com.xzh.clothes.UserModule;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.xzh.clothes.command.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     查询所有用户或个别用户
     */
    @RequestMapping(value = "/queryUser")
    public Message queryUser(@RequestBody UserDo userDo, @RequestParam(value = "page" ) Integer page,
                             @RequestParam(value = "size")Integer size){

        PageHelper.startPage(page,size);
        List<UserDo> userDos = userServiceImpl.queryUser(userDo.getUserName(), userDo.getUserPhone());
        // 分页
        PageInfo<UserDo> userDoPageInfo = new PageInfo<>(userDos);
        Message message = new Message(0,"suceess",userDoPageInfo);

        return message;
    }

    /**
     用户注册
     */
    @RequestMapping(value = "/insertUser")
    public Message insertUser(@RequestBody UserDo userDo){
        Message message = new Message();
        userDo.setUserMoney(new BigDecimal(0));//设置钱
        Integer integer = 0;
        try{
            integer = userServiceImpl.addUser(userDo);
            if(integer!=0){
                message.setMessage("success");
                message.setState(0);
                message.setData(integer);
            }
            else{
                message.setMessage("注册失败！");
                message.setState(1);
                message.setData(integer);
            }

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
        return message;
    }

    /**
     用户登录
     */
    @RequestMapping(value = "/selectUser")
    public Message  selectUser(@RequestBody UserDo userDo){
        Message message = new Message();
        UserDo selectUser = selectUser = userServiceImpl.selectUser(userDo.getUserName(),userDo.getUserPass());
        if (selectUser != null){
            message.setMessage("success");
            message.setState(0);
            message.setData(selectUser);
        } else{
            String messageInfo = "用户名或者密码不存在";
            message.setMessage(messageInfo);
            message.setState(1);
            message.setData(null);
        }
        return message;
    }

    /**
     用户删除
     */
    @RequestMapping(value = "/deleteUser")
    public Message  deleteUser(String userName){
        Message message;
        Integer integer= userServiceImpl.deleteUser(userName);
        if (integer == 0){
             message=new Message(1,"suceess",integer);
        } else {
             message=new Message(0,"suceess",integer);
        }
        return message;
    }
    /**
     用户修改
     */
    @RequestMapping(value = "/updeteUser")
    public Message  updeteUser(@RequestBody UserDo userDo){
        Message message;
        Integer integer = userServiceImpl.updateUser(userDo);
        if (integer == 0){
            message=new Message(1,"suceess",integer);
        } else {
            message=new Message(0,"suceess",integer);
        }

        return message;
    }


}
