package com.gloria.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val validuserName: String = "Admin"
    val validpassword: String = "Admin"

    //layout variables
    private lateinit var userNameinput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userNameinput = findViewById(R.id.UserNameInput)
        passwordInput = findViewById(R.id.PasswordInput)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val username = userNameinput.text.toString()
            val password = passwordInput.text.toString()

            login(username, password)
        }
    }

    private fun login(username: String, password: String) {
        if (isvalidCredentials(username, password)) {
            val intent: Intent = Intent(this, HomeActivity2::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
        } else {
            Toast.makeText(applicationContext, "invalid login", Toast.LENGTH_SHORT).show()
        }
    }

    fun isvalidCredentials(userName: String, password: String): Boolean {
        if (userName == validuserName && password == validpassword) return true
        return false
    }

}








