package com.example.loginapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas1.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val textViewRegister = findViewById<TextView>(R.id.textViewRegister)

        buttonLogin.setOnClickListener {
            // Handle login logic here
        }

        textViewRegister.setOnClickListener {
            // Handle registration logic here
        }
    }
}
