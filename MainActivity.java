package com.jaspal.recyclerviewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView  mList;
    ArrayList<String> mNameArrayList;
    ArrayList<Integer> mPitureArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameArrayList=new ArrayList<>();
        mNameArrayList.add("aman");
        mNameArrayList.add("raman");
        mNameArrayList.add("rohit");
        mNameArrayList.add("guri");
        mNameArrayList.add("pawan");
        mNameArrayList.add("harray");
        mNameArrayList.add("gopi");
        mNameArrayList.add("heena");

        mPitureArrayList=new ArrayList<>();
        mPitureArrayList.add(R.drawable.ic_launcher);
        mPitureArrayList.add(R.drawable.ic_launcher);
        mPitureArrayList.add(R.drawable.ic_launcher);
        mPitureArrayList.add(R.drawable.ic_launcher);
        mPitureArrayList.add(R.drawable.ic_launcher);
        mPitureArrayList.add(R.drawable.ic_launcher);
        mPitureArrayList.add(R.drawable.ic_launcher);
        mPitureArrayList.add(R.drawable.ic_launcher);


        mList= (RecyclerView) findViewById(R.id.my_list);
        MyAdapter adapter=new MyAdapter(MainActivity.this,mNameArrayList,mPitureArrayList);
        LinearLayoutManager manager=new LinearLayoutManager(MainActivity.this);
       // GridLayoutManager manager=new GridLayoutManager(MainActivity.this,3);
        mList.setLayoutManager(manager);
        mList.setAdapter(adapter);

    }
}
