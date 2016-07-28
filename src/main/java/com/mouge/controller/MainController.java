package com.mouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * first spring mvc
 * Created by jaf on 16/7/28.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        /*处理完请求后返回的界面*/
        /*定义了所需访问jsp的名字*/
        return "index";
    }
}
