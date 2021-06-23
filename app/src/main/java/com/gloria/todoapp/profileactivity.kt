package com.gloria.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.gloria.todoapp.databinding.ActivityProfileactivityBinding
import kotlinx.android.synthetic.main.activity_profileactivity.*

class profileactivity : AppCompatActivity() {


    private lateinit var binding: ActivityProfileactivityBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileactivity)

        binding = ActivityProfileactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener{
            val anyIntent = Intent(this,button2::class.java)
            startActivity(anyIntent)

        }
    }
}