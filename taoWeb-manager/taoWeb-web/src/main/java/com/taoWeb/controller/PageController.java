package com.taoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    //点击后地址会绑定当前的地址，将该地址传入后台
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;//再返回前台页面
    }
}
