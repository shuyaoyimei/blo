package com.shuyaoyimei.blog.controller;

import com.shuyaoyimei.blog.model.Article;
import com.shuyaoyimei.blog.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by mafu on 5/16/17.
 */
@Controller
@RequestMapping("/admin")
public class ArticleController {

    @Resource
    private BlogService blogService;

    @RequestMapping(value = "/add_article",method = POST)
    public String add(Article article){
//        do save and check save whether sucess
        article.setCreate_date(new Date());
        blogService.saveArticle(article);
        return "redirect:/admin";
    }


}
