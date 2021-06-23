package com.gloria.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity2 : AppCompatActivity() {

    private lateinit var profile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        profile = findViewById(R.id.profile)
        profile.setOnClickListener {
            val intent: Intent = Intent(this, profileactivity::class.java)
            startActivity(intent)
        }

    }
}

