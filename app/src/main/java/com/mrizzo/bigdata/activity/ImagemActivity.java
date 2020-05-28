package com.mrizzo.bigdata.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mrizzo.bigdata.R;
import com.mrizzo.bigdata.adapter.FotoAdapter;

public class ImagemActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagem);

        recyclerView = findViewById(R.id.recyclerView);
        //layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //adapter
        FotoAdapter adapter = new FotoAdapter();
        recyclerView.setAdapter(adapter);

    }
}
