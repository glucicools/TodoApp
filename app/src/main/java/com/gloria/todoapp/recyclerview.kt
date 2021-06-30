package com.gloria.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gloria.todoapp.adapter.CountryAdapter
import com.gloria.todoapp.databinding.ActivityProfileactivityBinding
import com.gloria.todoapp.databinding.ActivityRecyclerviewBinding
import com.gloria.todoapp.models.Country

class recyclerview : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerviewBinding
    private lateinit var myCountryAdapter: CountryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countries: List<Country> = ListOff(
            Country(
                R.drawable.ic_chineseflag,
                name"China",
            continent"Asia",
            population 15L,
            ),

            Country(
                R.drawable.ic_nigeria,
                name"Nigeria",
                continent"Africa",
            Population 10L
            ),

            Country(
                R.drawable.ic_uk_flag,
            name"United Kingdom",
            continent"Europe",
            population 20L,
            ),

            Country(
                R.drawable.ic_usa__flag,
            name"United States of American",
            continent"North America",
            population 18L,
            ),
        )

        myCountryAdapter = CountryAdapter()
    }
}