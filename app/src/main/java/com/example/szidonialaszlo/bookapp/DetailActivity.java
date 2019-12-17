package com.example.szidonialaszlo.bookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {


    private  Book book;
    private DetailsHolder detailsHolder;

   // private ArrayList<Book> bookList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        detailsHolder = (DetailsHolder) getIntent().getExtras().get("DetailsHolder_Serializable");
        book = detailsHolder.getEntity();


        setContentView(R.layout.activity_detail);

        TextView author = (TextView) findViewById(R.id.vauthor);
        author.setText("Author: "+book.getAuthor());

        TextView title= (TextView) findViewById(R.id.vtitle);
        title.setText("Title: "+book.getTitle());

        TextView price = (TextView) findViewById(R.id.vprice);
        price.setText("Price: "+book.getPrice());

        TextView yearOfPublication = (TextView) findViewById(R.id.vyear);
        yearOfPublication.setText("Year of publication: "+ book.getYearOfPublication());

        TextView description = (TextView) findViewById(R.id.vdescription);
        description.setText("Short description: "+book.getDescription());

        TextView status = (TextView) findViewById(R.id.vstatus);
        status.setText("Status: ");


    }

    }





