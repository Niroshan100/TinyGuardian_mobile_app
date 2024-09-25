package com.example.tinyguardian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener(){
            val inten = Intent(this, home::class.java)
            startActivity(inten)
        }
    }
}