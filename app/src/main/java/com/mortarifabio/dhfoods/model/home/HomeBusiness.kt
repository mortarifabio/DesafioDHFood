package com.mortarifabio.dhfoods.model.home

import com.mortarifabio.dhfoods.model.RestaurantList

class HomeBusiness {

    private val repository: HomeRepository by lazy {
        HomeRepository()
    }

    fun getRestaurants(): RestaurantList {
        return repository.getRestaurants()
    }
}