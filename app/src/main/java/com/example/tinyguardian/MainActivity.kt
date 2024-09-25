package com.example.tinyguardian

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.onboarding1)
        val btn = findViewById<ImageButton>(R.id.imageButton2)
        btn.setOnClickListener(){
            val inten = Intent(this, onboarding2::class.java)
            startActivity(inten)
        }
    }
}