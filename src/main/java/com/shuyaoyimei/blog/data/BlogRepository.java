package com.shuyaoyimei.blog.data;

import com.shuyaoyimei.blog.Articles;

import java.util.List;

/**
 * Created by mafu on 5/8/17.
 */
public interface BlogRepository {
    List<Articles> findBlog(long id);
}
