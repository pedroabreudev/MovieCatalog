package br.com.pedroabreudev.moviecatalog.services

import br.com.pedroabreudev.moviecatalog.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

//private const val api_key = "418fc16ab5943f1423c436aed898d978"

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=bbf5a3000e95f1dddf266b5e187d4b21")
    fun getMovieList(): Call<MovieResponse>
}