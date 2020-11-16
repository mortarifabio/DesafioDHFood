package com.mortarifabio.dhfoods.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mortarifabio.dhfoods.R
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
        fun bind(dish: Dish, onItemClicked: (Int) -> Unit) = with(itemView) {
            Glide.with(context).load(dish.img).into(findViewById(R.id.ivRestaurantDishImage))
            findViewById<TextView>(R.id.tvRestaurantDishName).text = dish.name
            findViewById<CardView>(R.id.cvRestaurantDish)?.setOnClickListener {
                onItemClicked(this@ViewHolder.adapterPosition)
            }
        }
    }
}