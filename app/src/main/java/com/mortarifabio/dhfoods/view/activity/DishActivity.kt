package com.mortarifabio.dhfoods.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.model.Dish
import com.mortarifabio.dhfoods.view.adapter.DishListAdapter.Companion.KEY_INTENT_DISH

class DishActivity : AppCompatActivity() {

    private var dish: Dish? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish)
        dish = intent.getParcelableExtra(KEY_INTENT_DISH)
        setupDish()
        setupObservables()
    }

    private fun setupDish() {
        Glide.with(this).load(dish?.img).into(findViewById(R.id.ivDishImage))
        findViewById<TextView>(R.id.tvDishName).text = dish?.name
        findViewById<TextView>(R.id.tvDishDescription).text = dish?.description
    }

    private fun setupObservables() {
        findViewById<Button>(R.id.btDishBack).setOnClickListener {
            finish()
        }
    }
}