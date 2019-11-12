package com.xzh.clothes.baseController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaonuolen
 * @version 1.0
 * @date 2019/11/10 13:50
 */
@Controller
@RequestMapping(value = "/clothesing/server")
public class ServerPageController {
    @RequestMapping(value = "/login")
    public String login(){
        return "/server/login";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "/server/index";
    }

}
