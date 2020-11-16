package com.mortarifabio.dhfoods.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.model.Restaurant

class HomeAdapter(
    private val restaurantList: List<Restaurant>,
    private val onItemClicked: (Int) -> Unit
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_restaurant_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(restaurantList[position], onItemClicked)
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(restaurant: Restaurant, onItemClicked: (Int) -> Unit) = with(itemView) {
            Glide.with(context).load(restaurant.img).into(findViewById(R.id.ivHomeRestaurantImage))
            findViewById<TextView>(R.id.tvHomeRestaurantName).text = restaurant.name
            findViewById<TextView>(R.id.tvHomeRestaurantAddress).text = restaurant.address
            findViewById<TextView>(R.id.tvHomeRestaurantTime).text = context.getString(R.string.close_time_message, restaurant.time)
            findViewById<CardView>(R.id.cvHomeRestaurant).setOnClickListener {
                onItemClicked(this@ViewHolder.adapterPosition)
            }
        }
    }
}
