package com.shuyaoyimei.blog.data;

import com.shuyaoyimei.blog.model.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by mafu on 5/8/17.
 */
@Mapper
public interface BlogMapper {
    @Select(" SELECT id, title, author, create_time, update_time,message FROM blog WHERE id = #{id}")
    Article findById(@Param("id") long id);

    @Insert("INSERT INTO blog (id,title,author,create_time,message) VALUES (#{id},#{title},#{author},#{create_time},#{message})")
    int save(Article article);

    @Select("SELECT id, title, author, create_time, update_time,message FROM blog ORDER BY id desc ")
    List<Article> findAllArticles();

    @Select("SELECT id, title, author, create_time, update_time,message FROM blog where del = 1 ORDER BY id desc ")
    List<Article> findAllNotDelArticles();

    @Update("UPDATE blog set title = #{title}, author = #{author},create_time = #{create_time}, update_time = #{update_time},message = #{message} where id = #{id}")
    int update( Article article);

    @Update("UPDATE blog set del = 0 where id = #{id}")
    int delete(@Param("id") long id);

    @Update("UPDATE blog set del = 1 where id = #{id}")
    int reduce(@Param("id") long id);
}
