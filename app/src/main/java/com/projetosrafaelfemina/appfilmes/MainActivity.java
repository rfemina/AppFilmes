package com.projetosrafaelfemina.appfilmes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.projetosrafaelfemina.appfilmes.Adapter.AdapterMovie;
import com.projetosrafaelfemina.appfilmes.Model.Movie;
import com.projetosrafaelfemina.appfilmes.Model.MovieApi;
import com.projetosrafaelfemina.appfilmes.OnClick.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView_films;
    private AdapterMovie adapterMovie;
    private List<Movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        StartComponents();
        movieList = new ArrayList<>();
        getSupportActionBar().hide();

        // Eventos de click da RecyclerView
        recyclerView_films.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recyclerView_films,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(getApplicationContext(), Movie_details.class);
                        intent.putExtra("capa", movieList.get(position).getCapa());
                        intent.putExtra("titulo", movieList.get(position).getTitulo());
                        intent.putExtra("descricao", movieList.get(position).getDescricao());
                        intent.putExtra("elenco", movieList.get(position).getElenco());
                        intent.putExtra("video", movieList.get(position).getVideo());
                        startActivity(intent);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
        ));

        // Configurar Retrofit
        Retrofit retrofit = new Retrofit.Builder().baseUrl
                        ("https://firebasestorage.googleapis.com/v0/b/app-filmes-e73f2.appspot.com/o/").addConverterFactory(GsonConverterFactory.create())
                .build();

        // Iniciar a retrofit
        MovieApi movieApi = retrofit.create(MovieApi.class);
        Call<List<Movie>> call = movieApi.getMovies();
        call.enqueue(new Callback<List<Movie>>() {
            @Override
            public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
                if (response.code() != 200) {
                    return;
                }
                List<Movie> movies = response.body();
                for (Movie movie : movies) {
                    movieList.add(movie);
                }
                adapterMovie = new AdapterMovie(getApplicationContext(), movieList);
                recyclerView_films.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                recyclerView_films.setHasFixedSize(true);
                recyclerView_films.setAdapter(adapterMovie);

            }

            @Override
            public void onFailure(Call<List<Movie>> call, Throwable throwable) {

            }
        });

    }

    public void StartComponents() {
        recyclerView_films = findViewById(R.id.recyclerView_films);
    }
}