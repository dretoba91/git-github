package com.example.mymovies

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun  getPopularMovies(
        @Query("api_key") apiKey: String  = "99f4ed66ea10404b9604c74620f7b6ed",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String ="99f4ed66ea10404b9604c74620f7b6ed",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>


    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String ="99f4ed66ea10404b9604c74620f7b6ed",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}