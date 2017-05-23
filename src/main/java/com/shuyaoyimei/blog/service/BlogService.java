package com.shuyaoyimei.blog.service;

import com.shuyaoyimei.blog.data.BlogMapper;
import com.shuyaoyimei.blog.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mafu on 5/19/17.
 */
@Service
@Transactional
public class BlogService {
    @Autowired
    private BlogMapper blogMapper;

    public Article getArticleById(long id){
        return blogMapper.findById(id);
    }

    public void saveArticle(Article article){
        blogMapper.save(article);
    }

    public List<Article> getAllArticle(){
        return blogMapper.findAllArticles();
    }
}
