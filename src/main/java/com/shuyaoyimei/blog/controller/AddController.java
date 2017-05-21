package com.shuyaoyimei.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by mafu on 5/16/17.
 */
@Controller
@RequestMapping("/admin")
public class AddController {

    @RequestMapping(value = "/add_article",method = POST)
    public String add(){
//        do save and check save whether sucess

        return "admin";
    }
}
