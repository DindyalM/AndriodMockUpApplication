package com.example.dindyal_mursingh_assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dindyal_mursingh_assignment1.Adapter.Speakers_Adapter_class;
import com.example.dindyal_mursingh_assignment1.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class Speakers extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    List<Item> items;
    Speakers_Adapter_class adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speakers);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        initItem();
    }
    private void initItem(){
        items = new ArrayList<>();

        items.add(new Item(0,"Member1","Talk_subject","https://vig" +
                "nette.wikia.nocookie.net" +
                "/bungostraydogs/images/1/1e/Profile-icon-9." +
                "png/revision/latest?cb=20171030104015"));

        items.add(new Item(1,"Member2","Talk_subject2","https://vig" +
                "nette.wikia.nocookie.net" +
                "/bungostraydogs/images/1/1e/Profile-icon-9." +
                "png/revision/latest?cb=20171030104015"));
        items.add(new Item(1,"Member3","Talk_subject3","https://vig" +
                "nette.wikia.nocookie.net" +
                "/bungostraydogs/images/1/1e/Profile-icon-9." +
                "png/revision/latest?cb=20171030104015"));
        items.add(new Item(1,"Member4","Talk_subject2","https://vig" +
                "nette.wikia.nocookie.net" +
                "/bungostraydogs/images/1/1e/Profile-icon-9." +
                "png/revision/latest?cb=20171030104015"));
        items.add(new Item(1,"Member5","Talk_subject4","https://vig" +
                "nette.wikia.nocookie.net" +
                "/bungostraydogs/images/1/1e/Profile-icon-9." +
                "png/revision/latest?cb=20171030104015"));
        items.add(new Item(1,"Member6","Talk_subject3","https://vig" +
                "nette.wikia.nocookie.net" +
                "/bungostraydogs/images/1/1e/Profile-icon-9." +
                "png/revision/latest?cb=20171030104015"));
        items.add(new Item(1,"Member6","Talk_subject4","https://vig" +
                "nette.wikia.nocookie.net" +
                "/bungostraydogs/images/1/1e/Profile-icon-9." +
                "png/revision/latest?cb=20171030104015"));


        adapter = new Speakers_Adapter_class(this, items);
        recyclerView.setAdapter(adapter);
    }
}
