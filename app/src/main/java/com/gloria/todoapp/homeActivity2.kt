package com.gloria.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity2 : AppCompatActivity() {

    private lateinit var userNameDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        userNameDisplay = findViewById(R.id.userNameDisplay)
        userNameDisplay.text = "This home page"
    }
}