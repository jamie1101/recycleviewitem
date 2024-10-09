package com.example.recycleviewitem;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerviewAdapter listAdapter;
    static String[] data ={"abc","123","48763","hello world","apple"};
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 20; i++) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("number",String.format("%02d", i + 1));
            hashMap.put("data","data : "+String.valueOf(data[new Random().nextInt(5)]));
            arrayList.add(hashMap);
        }
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        listAdapter = new RecyclerviewAdapter(arrayList);
        recyclerView.setAdapter(listAdapter);
    }

}
