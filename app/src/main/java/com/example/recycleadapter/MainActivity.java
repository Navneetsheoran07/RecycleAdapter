package com.example.recycleadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<RecylerModel>  userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userlist = new ArrayList<>();
        recyclerView= findViewById(R.id.recyclerview);
       // LinearLayoutManager layoutManager =  new LinearLayoutManager(getApplicationContext());
       // recyclerView.setLayoutManager(layoutManager);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),4,RecyclerView.HORIZONTAL,false);

        recyclerView.setLayoutManager(gridLayoutManager);

        userlist.add(new RecylerModel("a",R.drawable.a));
        userlist.add(new RecylerModel("aabb",R.drawable.aabb));
        userlist.add(new RecylerModel("aabc",R.drawable.aabc));
        userlist.add(new RecylerModel("aax",R.drawable.aax));
        userlist.add(new RecylerModel("ab",R.drawable.ab));
        userlist.add(new RecylerModel("abb",R.drawable.abb));
        userlist.add(new RecylerModel("abs",R.drawable.abs));
        userlist.add(new RecylerModel("bhgy",R.drawable.bhgy));
        userlist.add(new RecylerModel("c",R.drawable.c));
        userlist.add(new RecylerModel("cjkdf",R.drawable.cjkdf));
        userlist.add(new RecylerModel("ghb",R.drawable.ghb));
        userlist.add(new RecylerModel("hfh",R.drawable.hfh));
        userlist.add(new RecylerModel("ggnk",R.drawable.hhnk));
        userlist.add(new RecylerModel("huh",R.drawable.huh));
        userlist.add(new RecylerModel("imag",R.drawable.imag));
        userlist.add(new RecylerModel("images",R.drawable.images));
        userlist.add(new RecylerModel("jbnj",R.drawable.jbnj));
        userlist.add(new RecylerModel("je",R.drawable.je));
        userlist.add(new RecylerModel("jf",R.drawable.jf));
        userlist.add(new RecylerModel("jfd",R.drawable.jfd));

        CustomRecyclerAdapter customRecyclerAdapter = new CustomRecyclerAdapter(userlist,getApplicationContext());
        recyclerView.setAdapter(customRecyclerAdapter);
    }
}