package com.mortarifabio.dhfoods.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.databinding.HomeRestaurantItemBinding
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
        val binding = HomeRestaurantItemBinding.bind(itemView)
        fun bind(restaurant: Restaurant, onItemClicked: (Int) -> Unit) = with(itemView) {
            Glide.with(context).load(restaurant.img).into(binding.ivHomeRestaurantImage)
            binding.tvHomeRestaurantName.text = restaurant.name
            binding.tvHomeRestaurantAddress.text = restaurant.address
            binding.tvHomeRestaurantTime.text = context.getString(R.string.close_time_message, restaurant.time)
            binding.cvHomeRestaurant.setOnClickListener {
                onItemClicked(this@ViewHolder.adapterPosition)
            }
        }
    }
}
