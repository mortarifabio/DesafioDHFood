package com.mortarifabio.dhfoods.view.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.model.DishList
import com.mortarifabio.dhfoods.view.activity.DishActivity

class DishListAdapter(
    private val dishListList: List<DishList>
) : RecyclerView.Adapter<DishListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurant_dish_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dishList = dishListList[position]
        holder.bind(dishList)
        holder.recyclerView.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = DishAdapter(dishList.dishes) { dishPosition ->
                val intent = Intent(context, DishActivity::class.java)
                intent.putExtra(KEY_INTENT_DISH, dishList.dishes[dishPosition])
                startActivity(context, intent, null)
            }
        }
    }

    override fun getItemCount(): Int {
        return dishListList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerView: RecyclerView = itemView.findViewById(R.id.rvRestaurantDishList)
        fun bind(dishList: DishList) = with(itemView) {
            findViewById<TextView>(R.id.tvRestaurantDishListName).text = dishList.name
        }
    }

    companion object {
        const val KEY_INTENT_DISH = "dish"
    }
}