package com.example.fragmentdemo1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentdemo1.databinding.CustomWeatherBinding

class HourlyInfoAdapter(private val context: Context, private val items: ArrayList<DetailsWeather>) :
    RecyclerView.Adapter<HourlyInfoAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: CustomWeatherBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: DetailsWeather) {
            binding.imageView2.setImageResource(item.pic)
            binding.texttime.text = item.time1
            binding.texttemp.text = item.temp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CustomWeatherBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int = items.size
}
