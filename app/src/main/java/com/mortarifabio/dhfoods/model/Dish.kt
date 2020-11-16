package com.mortarifabio.dhfoods.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Dish(
    val id: Int,
    val name: String,
    val img: String,
    val description: String
) : Parcelable