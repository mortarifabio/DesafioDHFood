package com.mortarifabio.dhfoods.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurant(
    val id: Int,
    val name: String,
    val img: String,
    val address: String,
    val time: String,
    val dishLists: List<DishList>
) : Parcelable