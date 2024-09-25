package com.example.tinyguardian

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class onboarding4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding4)

        val btn1 = findViewById<ImageButton>(R.id.imageButton4)
        val btn2 = findViewById<TextView>(R.id.already_hav)

        btn1.setOnClickListener() {
            val inten = Intent(this, signup::class.java)
            startActivity(inten)
        }

        btn2.setOnClickListener() {
            val inten = Intent(this, login::class.java)
            startActivity(inten)
        }
    }
}