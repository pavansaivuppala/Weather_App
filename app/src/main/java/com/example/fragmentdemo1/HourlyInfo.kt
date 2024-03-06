package com.example.fragmentdemo1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentdemo1.databinding.FragmentHourlyInfoBinding

class HourlyInfo : Fragment() {

    private lateinit var binding: FragmentHourlyInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHourlyInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.recycle
        val spanCount = 1
        recyclerView.layoutManager = GridLayoutManager(requireContext(), spanCount, LinearLayoutManager.HORIZONTAL, false)


        val yourList = ArrayList<DetailsWeather>().apply {
            add(DetailsWeather("12:00 PM", R.drawable.ic_launcher_foreground, "25°C"))
            add(DetailsWeather("01:00 PM", R.drawable.ic_launcher_foreground, "26°C"))
            add(DetailsWeather("02:00 PM", R.drawable.ic_launcher_foreground, "27°C"))
            add(DetailsWeather("03:00 PM", R.drawable.ic_launcher_foreground, "28°C"))
        }

        val adapter = HourlyInfoAdapter(requireContext(), yourList)
        recyclerView.adapter = adapter
    }
}
