package br.com.pedroabreudev.moviecatalog.services

import br.com.pedroabreudev.moviecatalog.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("people")
    fun getMovieList(): Call<MovieResponse>
}