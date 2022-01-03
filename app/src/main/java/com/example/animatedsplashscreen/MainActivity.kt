package com.example.animatedsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartExplore = findViewById<Button>(R.id.btnStartExplore)
        btnStartExplore.setOnClickListener{
            val intent = Intent(this,First_layout_activity::class.java)
            startActivity(intent)

        }


    }
}