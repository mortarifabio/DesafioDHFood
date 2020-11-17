package com.mortarifabio.dhfoods.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mortarifabio.dhfoods.databinding.ActivityHomeBinding
import com.mortarifabio.dhfoods.view.adapter.HomeAdapter
import com.mortarifabio.dhfoods.viewModel.HomeViewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var viewModel: HomeViewModel
    private val recyclerView: RecyclerView by lazy {
        binding.rvHomeRestaurantList
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        viewModel.getRestaurants()
        setupObservables()
    }

    private fun setupObservables() {
        viewModel.restaurantsLiveData.observe(this) { restaurants ->
            recyclerView.apply {
                layoutManager = LinearLayoutManager(this@HomeActivity)
                adapter = HomeAdapter(restaurants.restaurantList) { position ->
                    val intent = Intent(this@HomeActivity, RestaurantActivity::class.java)
                    intent.putExtra(KEY_INTENT_RESTAURANT, restaurants.restaurantList[position])
                    startActivity(intent)
                }
            }
        }
    }

    companion object {
        const val KEY_INTENT_RESTAURANT = "restaurant"
    }
}