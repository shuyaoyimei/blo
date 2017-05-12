package com.shuyaoyimei.blog;

import java.util.Date;

/**
 * Created by mafu on 5/8/17.
 */
public class Articles {
    private final Long id;
    private final String title;
    private final String author;
    private final Date date;
    private final String message;

    public Articles(String title, Date time,String author, String message){
        this.title = title;
        this.author = author;
        this.date = time;
        this.message = message;
        this.id = null;
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }
    public String getMessage() {
        return message;
    }
}
