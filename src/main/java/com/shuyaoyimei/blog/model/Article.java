package com.shuyaoyimei.blog.model;

import com.sun.istack.internal.NotNull;

import java.util.Date;

/**
 * Created by mafu on 5/8/17.
 */
public class Article implements Comparable<Article> {
    private  long id;
    @NotNull
    private  String title;

    @NotNull
    private  String author;

    @NotNull
    private  Date create_time;

    private  Date update_time;

    @NotNull
    private  String message;


    private Boolean del;
//    private String stringDate;
//
//    public void transStrToDate(){
//        this.create_time = new Date(this.stringDate);
//    }

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
        this.create_time = create_date;
    }

    public void setUpdate_time(Date update_date) {
        this.update_time = update_date;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public Boolean getDel() {
        return del;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public String getMessage() {
        return message;
    }


    public int compareTo(Article o){
        return this.getId().compareTo(o.getId());
    }

}
