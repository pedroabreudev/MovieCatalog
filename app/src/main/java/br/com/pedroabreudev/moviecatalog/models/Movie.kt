package br.com.pedroabreudev.moviecatalog.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val name: String,
    val height: String,
    val gender: String,
    val mass: String

) : Parcelable{
    constructor() : this ("", "", "", "")
}
