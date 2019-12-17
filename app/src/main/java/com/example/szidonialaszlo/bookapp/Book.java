package com.example.szidonialaszlo.bookapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by szidonia.laszlo on 2017. 10. 26..
 */

public class Book implements Serializable{
    private String title;
    private String author;
    private int price;
    private String yearOfPublication;
    private String description;
    private String status1;
    private String status2;

    public Book(String author, String title, int price, String y, String d,String s1,String s2){
        this.title=title;
        this.author=author;
        this.price=price;
        this.yearOfPublication=y;
        this.description=d;
        this.status1=s1;
        this.status2=s2;


    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPrice(){ return this.price;}

    public String getYearOfPublication(){ return this.yearOfPublication;}

    public String getDescription (){ return this.description;}

    public String getStatus1(){
        return this.status1;
    }

    public String getStatus2(){
        return this.status2;

    }


}
