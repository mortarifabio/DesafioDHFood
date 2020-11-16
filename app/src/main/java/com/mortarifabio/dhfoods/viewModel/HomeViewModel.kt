package com.mortarifabio.dhfoods.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mortarifabio.dhfoods.model.home.HomeBusiness
import com.mortarifabio.dhfoods.model.RestaurantList

class HomeViewModel : ViewModel() {

    val restaurantsLiveData: MutableLiveData<RestaurantList> = MutableLiveData()
    private val homeBusiness = HomeBusiness()

    fun getRestaurants() {
        restaurantsLiveData.postValue(homeBusiness.getRestaurants())
    }
}