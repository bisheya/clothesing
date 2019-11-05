package com.xzh.clothes.UserModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String query(){
        List<UserDo> userDos = userServiceImpl.queryUser("", "");
        System.out.println(userDos);
        return "sgw123";
    }
}
