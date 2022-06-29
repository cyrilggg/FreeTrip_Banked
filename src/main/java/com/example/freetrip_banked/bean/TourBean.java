package com.example.freetrip_banked.bean;

public class TourBean {
    private int id, user_id, praise;
    private String title, content;

    public int get_id() {
        return id;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public int get_user_id() {
        return user_id;
    }

    public void set_user_id(int user_id) {
        this.user_id = user_id;
    }

    public int get_praise() {
        return praise;
    }

    public void set_praise(int praise) {
        this.praise = praise;
    }

    public String get_title() {
        return title;
    }

    public void set_title(String title) {
        this.title = title;
    }

    public String get_content() {
        return content;
    }

    public void set_content(String content) {
        this.content = content;
    }


}
