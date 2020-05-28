package com.mrizzo.bigdata.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mrizzo.bigdata.R;
import com.mrizzo.bigdata.adapter.FotoAdapter;
import com.mrizzo.bigdata.model.Post;

import java.util.List;

public class ImagemActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Post> post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagem);

        recyclerView = findViewById(R.id.recyclerView);
        //layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //adapter
        this.addPost();

        FotoAdapter adapter = new FotoAdapter(post);
        recyclerView.setAdapter(adapter);

    }

    public void addPost(){
        Post post = new Post("Redentor", R.drawable.redentor_verde);
        this.post.add(post);

        post = new Post("Lanche", R.drawable.lanche);
        this.post.add(post);

        post = new Post("Obervando o desenho no muro", R.drawable.muro);
        this.post.add(post);

    }
}
