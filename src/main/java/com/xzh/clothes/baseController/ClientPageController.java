package com.xzh.clothes.baseController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaonuolen
 * @version 1.0
 * @date 2019/11/10 13:50
 */
@Controller
@RequestMapping(value = "/clothesing")
public class ClientPageController {
    @RequestMapping(value = "/login")
    public String login(){
        return "/client/login";
    }

    @RequestMapping(value = "/woman")
    public String woman(){
        return "/client/woman";
    }

    @RequestMapping(value = "/man")
    public String man(){
        return "/client/man";
    }

    @RequestMapping(value = "/baby")
    public String baby(){
        return "/client/baby";
    }

    @RequestMapping(value = "/old")
    public String old(){
        return "/client/old";
    }

    @RequestMapping(value = "/")
    public String defaultPage(){
        return "/client/login";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "/client/index";
    }

    @RequestMapping(value = "/file")
    public String file(){
        return "/client/uploadCommodity";
    }

}
