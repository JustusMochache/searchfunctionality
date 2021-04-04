package com.example.searchviewfunctionality;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    //constructor initialising this objects
    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    private List<ListItem> listItems;
    private Context context;


    // PRESS ALT+ ENTER ON OUR CLASS ABOVE TO IMPLEMENT ALL METHODS


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // create a view objectf and help of layout inflater we will get list_item layout resource file
       View v = LayoutInflater.from(parent.getContext())
       .inflate(R.layout.list_item, parent, false);
       return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     // get curent item from List iem object of libe 23
        ListItem listItem = listItems.get(position);
        holder.textViewHead.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    //ALT + ENTER TO CREATE A CONSTRUCTOR

    public class ViewHolder extends RecyclerView.ViewHolder{

        //we will bind data to view objects that is the two text views which we have to define
        public TextView textViewHead;
        public TextView textViewDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView) itemView.findViewById(R.id.tecxViewDesc);
        }
    }
}
