package com.shuyaoyimei.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by mafu on 5/7/17.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = GET)
    public String home(Model model){

        model.addAttribute("title","hello world");
        model.addAttribute("author","shuyaoyimei");
        model.addAttribute("date",new Date());
        model.addAttribute("message","this is the first article");
        return "index";
    }
}
