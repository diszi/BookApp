package com.example.szidonialaszlo.bookapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by szidonia.laszlo on 2017. 10. 26..
 */

public class DetailsHolder implements Serializable {
   // public static String SERIALIZABLE_NAME = "DetailsHolder_Serializable";
    private Book entity;
    private  int position;
   // private ArrayList<Book> entity;

    public DetailsHolder(Book b, int p)
    {
        this.entity=b;
        this.position=p;
    }

    public Book getEntity(){
        return this.entity;
    }

    public int getPosition(){
        return this.position;
    }

}
