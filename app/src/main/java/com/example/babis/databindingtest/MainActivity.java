package com.example.babis.databindingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.rv);
        ArrayList<SimpleObject> objects = new ArrayList<>();


        for(int i=0;i<100;i++){
            SimpleObject simpleObject = new SimpleObject();
            simpleObject.name = "hello there";
            simpleObject.setAge(String.valueOf(i));
            objects.add(simpleObject);
        }


        SimpleObjectAdapter adapter =  new SimpleObjectAdapter(objects);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);






    }
}
