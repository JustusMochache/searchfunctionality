package com.example.searchviewfunctionality;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;


import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.*;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.my_list);
        List<String> mylist = new ArrayList<>();
        mylist.add("Book");
        mylist.add("Cat");
        mylist.add("Dog");
        mylist.add("Lion");
        mylist.add("Tv");
        mylist.add("Laptop");
        mylist.add("Speaker");
        mylist.add("Window");
        mylist.add("Car");
        mylist.add("Solar");
        mylist.add("Rain");
        mylist.add("Bus");
        mylist.add("Children");
        mylist.add("Cow");
        mylist.add("Pen");
        mylist.add("Zoo");

        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, mylist);
        listView.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search_icon);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search here");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return true;

            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}