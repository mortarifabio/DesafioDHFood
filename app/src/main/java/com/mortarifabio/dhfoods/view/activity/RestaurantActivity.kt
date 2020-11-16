package com.mortarifabio.dhfoods.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.model.Restaurant
import com.mortarifabio.dhfoods.view.activity.HomeActivity.Companion.KEY_INTENT_RESTAURANT
import com.mortarifabio.dhfoods.view.adapter.DishListAdapter

class RestaurantActivity : AppCompatActivity() {

    private var restaurant: Restaurant? = null
    private val dishListRecyclerView: RecyclerView by lazy {
        findViewById(R.id.rvRestaurantDishListList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)
        restaurant = intent.getParcelableExtra(KEY_INTENT_RESTAURANT)
        setupRestaurant()
        setupObservables()
    }

    private fun setupRestaurant() {
        Glide.with(this).load(restaurant?.img).into(findViewById(R.id.ivRestaurantImage))
        findViewById<TextView>(R.id.tvRestaurantName).text = restaurant?.name
        dishListRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@RestaurantActivity)
            restaurant?.dishLists?.let { dishListList ->
                adapter = DishListAdapter(dishListList)
            }
        }
    }

    private fun setupObservables() {
        findViewById<Button>(R.id.btRestaurantBack).setOnClickListener {
            finish()
        }
    }
}