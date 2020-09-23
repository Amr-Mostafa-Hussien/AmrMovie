package com.example.amr

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey : String = "a6a99f79dccc16ae3b096614c7ccaf83",
        @Query("page") pageNumber: Int = 1
    ) : Call<MoviesResponse>
}