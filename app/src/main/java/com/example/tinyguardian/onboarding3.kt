package com.example.tinyguardian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener() {
            val inten = Intent(this, onboarding4::class.java)
            startActivity(inten)
        }
    }
}