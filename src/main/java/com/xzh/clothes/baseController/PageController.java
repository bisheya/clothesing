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
public class PageController {
    @RequestMapping(value = "/login")
    public String login(){
        return "/login";
    }

    @RequestMapping(value = "/woman")
    public String woman(){
        return "/woman";
    }

    @RequestMapping(value = "/man")
    public String man(){
        return "/man";
    }

    @RequestMapping(value = "/baby")
    public String baby(){
        return "/baby";
    }

    @RequestMapping(value = "/old")
    public String old(){
        return "/old";
    }

    @RequestMapping(value = "/")
    public String defaultPage(){
        return "/login";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }

}
