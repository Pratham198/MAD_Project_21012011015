package com.example.mad_project_21012011015

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val Login : Button = findViewById(R.id.button2)
        Login.setOnClickListener {
            Intent(this,RegistationActivity::class.java).also { startActivity(it) }
        }

        val page : Button = findViewById(R.id.button)
        page.setOnClickListener {
            Intent(this,FoodActivity::class.java).also { startActivity(it) }
        }
    }
}