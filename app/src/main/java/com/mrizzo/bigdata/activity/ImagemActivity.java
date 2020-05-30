package com.mrizzo.bigdata.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mrizzo.bigdata.R;
import com.mrizzo.bigdata.adapter.FotoAdapter;
import com.mrizzo.bigdata.model.Postagem;

import java.util.List;

public class ImagemActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Postagem> postagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagem);

        recyclerView = findViewById(R.id.recyclerView);
        //layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //adapter
        this.adicionarPostagens();
        FotoAdapter adapter = new FotoAdapter(postagens);
        recyclerView.setAdapter(adapter);
    }

    public void adicionarPostagens(){
        Postagem post = new Postagem("Redentor", R.drawable.redentor_verde);
        this.postagens.add(post);

        post = new Postagem("Lanche", R.drawable.lanche);
        this.postagens.add(post);

        post = new Postagem("Obervando o desenho no muro", R.drawable.muro);
        this.postagens.add(post);

    }
}
