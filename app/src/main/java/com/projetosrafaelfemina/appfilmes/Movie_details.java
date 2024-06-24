package com.projetosrafaelfemina.appfilmes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Movie_details extends AppCompatActivity {

    private ImageView dt_movieCover, playMovie;
    private TextView dt_movieTitle, dt_movieDescription, dt_movieCast;
    private Toolbar toolbar_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details_movie);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        StartComponents();
        getSupportActionBar().hide();

        String capa = getIntent().getExtras().getString("capa");
        String titulo = getIntent().getExtras().getString("titulo");
        String descricao = getIntent().getExtras().getString("descricao");
        String elenco = getIntent().getExtras().getString("elenco");
        String filme = getIntent().getExtras().getString("video");

        String stMovie = filme;

        Glide.with(getApplicationContext()).load(capa).into(dt_movieCover);
        dt_movieTitle.setText(titulo);
        dt_movieDescription.setText(descricao);
        dt_movieCast.setText(elenco);
        toolbar_details.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        playMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Movie_details.this, Movie.class);
                intent.putExtra("video", stMovie);
                startActivity(intent);
            }
        });

    }

    public void StartComponents() {
        dt_movieCover = findViewById(R.id.dt_coverMovie);
        playMovie = findViewById(R.id.bt_playMovie);
        dt_movieTitle = findViewById(R.id.dt_movieTitle);
        dt_movieDescription = findViewById(R.id.dt_movieDescription);
        dt_movieCast = findViewById(R.id.dt_movieCast);
        toolbar_details = findViewById(R.id.toolbar_details);
    }

}