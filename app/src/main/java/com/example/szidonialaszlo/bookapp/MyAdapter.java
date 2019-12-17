package com.example.szidonialaszlo.bookapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by szidonia.laszlo on 2017. 10. 25..
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private ArrayList<Book> listBooks ;

    private MainActivity main;



    public MyAdapter(ArrayList<Book> l, MainActivity view){
        this.listBooks = l;
       this.main=view;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        //get element from your dataset at this position
        final Book b = listBooks.get(position);

       holder.author.setText(b.getAuthor());
        holder.title.setText(b.getTitle());

        //holder.bind(b);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.launchBookDetails(new DetailsHolder(b,position));
            }
        });


    }


    @Override
    public int getItemCount() {
        return listBooks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView author;
        public  TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            author = (TextView) itemView.findViewById(R.id.author);
            title = (TextView) itemView.findViewById(R.id.title);
        }

    //hozzaadja a textview-khoz az adott informaciot, kiirja
        public void bind(Book b){
            author.setText(b.getAuthor());
            this.title.setText(b.getTitle());
        }

    }


}
