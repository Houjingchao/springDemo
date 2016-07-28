package com.mouge.controller;

import org.springframework.stereotype.Controller;

/**
 * first spring mvc
 * Created by jaf on 16/7/28.
 */
@Controller
public class MainController {
    public String index(){
        return "index";
    }
}
