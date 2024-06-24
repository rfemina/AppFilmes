package com.projetosrafaelfemina.appfilmes.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {

    @GET("filmes.json?alt=media&token=58b0dfaf-5f7c-4531-9b2b-7e10d17ef6cd")
    Call<List<Movie>> getMovies();

}
