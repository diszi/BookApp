package com.example.szidonialaszlo.bookapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;

  //  public static int BOOK_REQUEST_CODE = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.bookItems);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyAdapter(getBookList(),this);
        mRecyclerView.setAdapter(mAdapter);

    }

    private ArrayList<Book> getBookList(){
        ArrayList<Book> booklist = new ArrayList<>();
        booklist.add(new Book("Author1","Title1",10,"1992","description1","Available","Not available"));
        booklist.add(new Book("Author2","Title2",10,"1992","description2","Available","Not available"));
        booklist.add(new Book("Author3","Title3",10,"1992","description3","Available","Not available"));
        booklist.add(new Book("Author4","Title4",10,"1992","description4","Available","Not available"));
        return booklist;
    }

    public void  launchBookDetails(DetailsHolder entity){
        Intent intent  = new Intent(this,DetailActivity.class);
        intent.putExtra("DetailsHolder_Serializable",entity);
        startActivity(intent);
    }


}
