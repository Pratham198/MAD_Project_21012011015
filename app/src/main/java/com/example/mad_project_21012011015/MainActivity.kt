package com.example.mad_project_21012011015

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Login : Button = findViewById(R.id.Login)
        Login.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }
        val SignUp : Button = findViewById(R.id.SignUp)
        SignUp.setOnClickListener {
            Intent(this,RegistationActivity::class.java).also { startActivity(it) }
        }

    }

}
