package br.com.pedroabreudev.moviecatalog.services

import br.com.pedroabreudev.moviecatalog.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

//private const val api_key = "418fc16ab5943f1423c436aed898d978"

interface MovieApiInterface {

    @GET("people")
    fun getMovieList(): Call<MovieResponse>
}