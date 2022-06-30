package com.example.freetrip_banked.bean;

public class LineBean {
    private int id, price;
    private String name, line, city;

    public int getid(){
        return id;
    }

    public void setid(int id){
        this.id = id;
    }

    public int getprice(){
        return price;
    }

    public void setprice(int price){
        this.price = price;
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getline(){
        return line;
    }

    public void setline(String line){
        this.line = line;
    }

    public String getcity(){
        return city;
    }

    public void setcity(String city){
        this.city = city;
    }

}
