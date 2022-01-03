package com.example.animatedsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class First_layout_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plantcare)

        val actionBar = supportActionBar

        actionBar!!.title = "FirstLayoutActivity"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}