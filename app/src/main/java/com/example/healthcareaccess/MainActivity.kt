package com.example.healthcareaccess

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIntent=findViewById<TextView>(R.id.contact_text)

        btnIntent.setOnClickListener{
            //open a new activity
            intent= Intent(applicationContext,details::class.java)
            startActivity(intent)
        }
    }
}