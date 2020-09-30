package com.nilson.tareaandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class verregistroActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verregistro);


        recyclerView = findViewById(R.id.recyclercelu);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        Adapatadocelu adapatadocelu = new Adapatadocelu(infodato2.infodato2);
        recyclerView.setAdapter(adapatadocelu);

    }
}