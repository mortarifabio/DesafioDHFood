package com.mortarifabio.dhfoods.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mortarifabio.dhfoods.databinding.ActivityRestaurantBinding
import com.mortarifabio.dhfoods.model.Restaurant
import com.mortarifabio.dhfoods.view.activity.HomeActivity.Companion.KEY_INTENT_RESTAURANT
import com.mortarifabio.dhfoods.view.adapter.DishListAdapter

class RestaurantActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestaurantBinding
    private var restaurant: Restaurant? = null
    private val dishListRecyclerView: RecyclerView by lazy {
        binding.rvRestaurantDishListList
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantBinding.inflate(layoutInflater)
        setContentView(binding.root)
        restaurant = intent.getParcelableExtra(KEY_INTENT_RESTAURANT)
        setupRestaurant()
        setupObservables()
    }

    private fun setupRestaurant() {
        Glide.with(this).load(restaurant?.img).into(binding.ivRestaurantImage)
        binding.tvRestaurantName.text = restaurant?.name
        dishListRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@RestaurantActivity)
            restaurant?.dishLists?.let { dishListList ->
                adapter = DishListAdapter(dishListList)
            }
        }
    }

    private fun setupObservables() {
        binding.btRestaurantBack.setOnClickListener {
            finish()
        }
    }
}