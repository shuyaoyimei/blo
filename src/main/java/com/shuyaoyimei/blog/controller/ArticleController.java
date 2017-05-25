package com.shuyaoyimei.blog.controller;

import com.shuyaoyimei.blog.model.Article;
import com.shuyaoyimei.blog.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by mafu on 5/16/17.
 */
@Controller
@RequestMapping("/admin/article")
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

    @RequestMapping(value = "/modify_article",method = POST)
    public String modify(Article article){
        article.setUpdate_time(new Date());
        Article tempArticle = blogService.getArticleById(article.getId());
        article.setCreate_date(tempArticle.getCreate_time());
        blogService.updateArticle(article);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/{articleId:[0-9]+}/modify",method = GET)
    public String modifyArticle(@PathVariable Long articleId, Model model){
        Article article = blogService.getArticleById(articleId);
        model.addAttribute("article",article);
        return "admin/modify_article";
    }


    @RequestMapping(value = "/{articleId:[0-9]+}/delete",method = GET)
    public String deleteArticle(@PathVariable Long articleId){
        blogService.deleteArticle(articleId);
        return "redirect:/admin";
    }


    @RequestMapping(value = "/{articleId:[0-9]+}/restore",method = GET)
    public String restoreArticle(@PathVariable Long articleId){
        blogService.reduceArticle(articleId);
        return "redirect:/admin";
    }
}
