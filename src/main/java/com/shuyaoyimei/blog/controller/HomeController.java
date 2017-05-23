package com.shuyaoyimei.blog.controller;

import com.shuyaoyimei.blog.model.Article;
import com.shuyaoyimei.blog.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by mafu on 5/7/17.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @Resource
    private BlogService blogService;

    @RequestMapping(method = GET)
    public String home(Model model){

        model.addAttribute("title","hello world");
        model.addAttribute("author","shuyaoyimei");
        model.addAttribute("date",new Date());
        model.addAttribute("message","this is the first article");
        List<Article> articles = blogService.getAllArticle();
        model.addAttribute("articleList",articles);
        return "index";
    }
}
