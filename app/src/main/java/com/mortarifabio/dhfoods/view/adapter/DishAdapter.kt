package com.mortarifabio.dhfoods.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.databinding.RestaurantDishItemBinding
import com.mortarifabio.dhfoods.model.Dish

class DishAdapter(
    private val dishList: List<Dish>,
    private val onItemClicked: (Int) -> Unit
) : RecyclerView.Adapter<DishAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurant_dish_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dishList[position], onItemClicked)
    }

    override fun getItemCount(): Int {
        return dishList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = RestaurantDishItemBinding.bind(itemView)
        fun bind(dish: Dish, onItemClicked: (Int) -> Unit) = with(itemView) {
            Glide.with(context).load(dish.img).into(binding.ivRestaurantDishImage)
            binding.tvRestaurantDishName.text = dish.name
            binding.cvRestaurantDish.setOnClickListener {
                onItemClicked(this@ViewHolder.adapterPosition)
            }
        }
    }
}