package br.com.pedroabreudev.moviecatalog.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("results")
    val results: List<Movie>

) : Parcelable {
    constructor() : this(mutableListOf())
}
