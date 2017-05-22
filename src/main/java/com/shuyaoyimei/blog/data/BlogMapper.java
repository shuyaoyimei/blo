package com.shuyaoyimei.blog.data;

import com.shuyaoyimei.blog.model.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mafu on 5/8/17.
 */
@Mapper
public interface BlogMapper {
    @Select(" SELECT id, title, author, create_time, update_time,mesage FROM articles WHERE id = #{id}")
    Article findById(@Param("id") long id);

    @Insert("INSERT INTO articles (id,title,author,create_time,message) VALUES (#{id},#{title},#{author},#{create_time},#{message})")
    int save(Article article);

    @Select("SELECT id, title, author, create_time, update_time,mesage FROM articles ")
    List<Article> findAllArticles();
}
