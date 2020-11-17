package com.mortarifabio.dhfoods.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.mortarifabio.dhfoods.databinding.ActivityDishBinding
import com.mortarifabio.dhfoods.model.Dish
import com.mortarifabio.dhfoods.view.adapter.DishListAdapter.Companion.KEY_INTENT_DISH

class DishActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDishBinding
    private var dish: Dish? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDishBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dish = intent.getParcelableExtra(KEY_INTENT_DISH)
        setupDish()
        setupObservables()
    }

    private fun setupDish() {
        Glide.with(this).load(dish?.img).into(binding.ivDishImage)
        binding.tvDishName.text = dish?.name
        binding.tvDishDescription.text = dish?.description
    }

    private fun setupObservables() {
        binding.btDishBack.setOnClickListener {
            finish()
        }
    }
}