package com.mortarifabio.dhfoods.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DishList(
    var id: Int,
    var name: String,
    var dishes: List<Dish>
) : Parcelable