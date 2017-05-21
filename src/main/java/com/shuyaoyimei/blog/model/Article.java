package com.shuyaoyimei.blog.model;

import com.sun.istack.internal.NotNull;

import java.util.Date;

/**
 * Created by mafu on 5/8/17.
 */
public class Article {
    private  long id;
    @NotNull
    private  String title;
    @NotNull
    private  String author;

    @NotNull
    private  Date create_date;

    private  Date update_date;
    private  String message;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }
    public String getMessage() {
        return message;
    }
}
