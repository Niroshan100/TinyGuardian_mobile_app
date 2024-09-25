package com.example.tinyguardian

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bell = findViewById<ImageButton>(R.id.imageButton11)
        val sett = findViewById<ImageButton>(R.id.imageButton12)
        val hme = findViewById<ImageButton>(R.id.imageButton8)
        val growtr = findViewById<ImageButton>(R.id.imageButton6)


        hme.setOnClickListener() {
            val inten = Intent(this, home::class.java)
            startActivity(inten)
        }

        sett.setOnClickListener() {
            val inten = Intent(this, settings::class.java)
            startActivity(inten)
        }

        bell.setOnClickListener() {
            val inten = Intent(this, notification::class.java)
            startActivity(inten)
        }

        growtr.setOnClickListener() {
            val inten = Intent(this, growtrack::class.java)
            startActivity(inten)
        }
    }
}