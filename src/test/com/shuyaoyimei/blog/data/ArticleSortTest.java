package com.shuyaoyimei.blog.data;

import com.shuyaoyimei.blog.model.Article;
import org.junit.Test;

import java.util.*;

/**
 * Created by mafu on 5/23/17.
 */
public class ArticleSortTest {
    @Test
    public void  testArticleSort(){
        List<Article> articles = new LinkedList<Article>();
        Article a1 = new Article();
        a1.setId((long) 1);
        a1.setTitle("hello1");
        a1.setAuthor("shu");
        a1.setCreate_date(new Date());
        a1.setMessage("hhhhhhhhhhhhhhhhhh1");

        Article a2 = new Article();
        a2.setId((long) 2);
        a2.setTitle("hello2");
        a2.setAuthor("shu2");
        a2.setCreate_date(new Date());
        a2.setMessage("hhhhhhhhhhhhhhhhhh2");

        Article a3 = new Article();
        a3.setId((long) 3);
        a3.setTitle("hello3");
        a3.setAuthor("shu3");
        a3.setCreate_date(new Date());
        a3.setMessage("hhhhhhhhhhhhhhhhhh3");

        Article a4 = new Article();
        a4.setId((long) 4);
        a4.setTitle("hello4");
        a4.setAuthor("shu4");
        a4.setCreate_date(new Date());
        a4.setMessage("hhhhhhhhhhhhhhhhhh4");

        articles.add(a4);
        articles.add(a2);
        articles.add(a1);
        articles.add(a3);

        Collections.sort(articles,Collections.reverseOrder());
        for (Article article : articles){
            System.out.println(article.getMessage());
        }

    }
}
