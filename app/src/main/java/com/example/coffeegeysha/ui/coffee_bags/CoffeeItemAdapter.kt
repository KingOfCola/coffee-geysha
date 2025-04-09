package com.example.coffeegeysha.ui.coffee_bags

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeegeysha.R
import com.example.coffeegeysha.data.Coffee

class CoffeeItemAdapter(val coffeeItemList: List<Coffee>) : RecyclerView.Adapter<CoffeeItemAdapter.CoffeeViewHolder>() {


    // Describes an item view and its place within the RecyclerView
    class CoffeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val coffeeBrandTextView: TextView = itemView.findViewById(R.id.value_brand)
        private val coffeeOriginTextView: TextView = itemView.findViewById(R.id.value_origin)
        private val coffeeNameTextView: TextView = itemView.findViewById(R.id.value_name)

        fun bind(coffee: Coffee) {
            coffeeNameTextView.text = coffee.name
            coffeeBrandTextView.text = coffee.brand
            coffeeOriginTextView.text = coffee.origin
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_coffee, parent, false)

        return CoffeeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return coffeeItemList.size
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        holder.bind(coffeeItemList[position])
    }
}