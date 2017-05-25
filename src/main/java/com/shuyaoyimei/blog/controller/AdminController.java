package com.shuyaoyimei.blog.controller;

import com.shuyaoyimei.blog.model.Article;
import com.shuyaoyimei.blog.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by mafu on 5/8/17.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private BlogService blogService;

    @RequestMapping(method = GET)
    public String admin(Model model){
//        model.addAttribute("title","hello world");
//        model.addAttribute("author","shuyaoyimei");
//        model.addAttribute("date",new Date());
//        model.addAttribute("message","this is the first article");
        List<Article> articles = blogService.getAllArticle();

        model.addAttribute("articleList",articles);

        return "admin/index";
    }

    @RequestMapping(value = "/login",method = GET)
    public String login(){


        return "admin/login";
    }

    @RequestMapping(value = "/add_article",method = GET)
    public String addArticle(){
        return "admin/article/add_article";

    }


}
