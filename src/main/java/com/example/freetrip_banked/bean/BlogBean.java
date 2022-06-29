package com.example.freetrip_banked.bean;

public class BlogBean{
    /**
     * 博客id
     */
    private int id;

    /**
     * 用户id
     */
    private int user_id;

    /**
     * 博客标题
     */
    private String title;

    /**
     * 博客内容
     */
    private String content;

    /**
     * 获赞数
     */
    private int praise;

    public BlogBean(){
    }

    public BlogBean(Integer id, Integer user_id, String title, String content, Integer praise){
        this.id=id;
        this.user_id=user_id;
        this.title=title;
        this.content=content;
        this.praise=praise;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return user_id;
    }
    public void setUserId(int user_id) {
        this.user_id = user_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getPraise() {
        return praise;
    }
    public void setPraise(int praise) {
        this.praise = praise;
    }
}