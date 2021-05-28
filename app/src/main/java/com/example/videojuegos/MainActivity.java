package com.example.videojuegos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.videojuegos.Adapters.StringAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager mLayoutManager;
    private static RecyclerView mRecyclerView;
    private StringAdapter mStringAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mRecyclerView=  findViewById(R.id.ListaString);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager= new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mStringAdapter = new StringAdapter(GetAnimes());//liststring
        mRecyclerView.setAdapter(mStringAdapter);


    }



    public List<Anime> GetAnimes(){
        List<Anime> lista= new ArrayList<Anime>();
        lista.add(new Anime(R.drawable.one_piece,"One Piece","Shonen es un manga escrito e ilustrado por Eiichirō Oda."));
        lista.add(new Anime(R.drawable.alfabetajuega_bleach_0,"Bleach","Ichigo dedica su vida a proteger inocentes y ayuda a los espíritus a encontrar la paz."));
        lista.add(new Anime(R.drawable.dragon_ball_z_2,"dragon ball z", "serie basada en el manga de dragon ball"));
        lista.add(new Anime(R.drawable.fairy_tail,"fairy tail", "Fairy Tail es un manga de aventura y fantasía escrito e ilustrado por Hiro Mashima"));
        lista.add(new Anime(R.drawable.dn,"death note", "Death Note es una serie de manga escrita por Tsugumi Ōba e ilustrada por Takeshi Obata "));
        return lista;
    }
}