package com.example.animatedsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class First_layout_activity : AppCompatActivity() {

    private lateinit var onboardingItemsAdapter: OnboardingItemsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plantcare)


        val actionBar = supportActionBar

//        actionBar!!.title = "FirstLayoutActivity"

//        actionBar.setDisplayHomeAsUpEnabled(true)
//github me code push karo and muje link send karo okk doing
        

        setOnboardingItem()
    }

    private fun setOnboardingItem(){
        onboardingItemsAdapter = OnboardingItemsAdapter(
            listOf(
                OnboardingItem(
                    onboardingImages = R.drawable.pic1,
                    title = "Step 1",
                    description = "Explore plant care guides"
                ),
                OnboardingItem(
                        onboardingImages = R.drawable.pic2,
                        title = "Step 2",
                        description="Get timely care reminders"

                ),
                OnboardingItem(
                    onboardingImages = R.drawable.pic3,
                    title = "Step 3",
                    description="Start your own garden"

                )

            )
        )
        val onboardingViewPager = findViewById<ViewPager2>(R.id.onboardingViewPager)
        onboardingViewPager.adapter = onboardingItemsAdapter
    }
}