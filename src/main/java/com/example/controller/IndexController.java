package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PVer on 2017/4/25.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap model){
        model.put("name","MyName");
        return "index";
    }
}
