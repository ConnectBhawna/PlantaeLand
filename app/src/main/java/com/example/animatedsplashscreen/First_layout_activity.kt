package com.example.animatedsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton

class First_layout_activity : AppCompatActivity() {

    private lateinit var indicatorsContainer: LinearLayout
    private lateinit var onboardingItemsAdapter: OnboardingItemsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plantcare)


        val actionBar = supportActionBar

//        actionBar!!.title = "FirstLayoutActivity"

//        actionBar.setDisplayHomeAsUpEnabled(true)


        setOnboardingItem()
        setupIndicators()
        setCurrentIndicator(0)

    }

    private fun setCurrentIndicator(i: Int) {
        val childCount = indicatorsContainer.childCount
        for(a in 0 until childCount) {
            val imageView = indicatorsContainer.getChildAt(i) as ImageView
            if(a == i) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active_background
                    )
                )
            }else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive_background
                    )
                )
            }
        }

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
                        onboardingImages = R.drawable.pic3,
                        title = "Step 2",
                        description="Get timely care reminders"

                ),
                OnboardingItem(
                    onboardingImages = R.drawable.pic2,
                    title = "Step 3",
                    description="Start your own garden"

                )

            )
        )
        val onboardingViewPager = findViewById<ViewPager2>(R.id.onboardingViewPager)
        onboardingViewPager.adapter = onboardingItemsAdapter
        onboardingViewPager.registerOnPageChangeCallback(object:
              ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position:Int) {
                setCurrentIndicator(position)
            }
              })
        (onboardingViewPager.getChildAt(0)as RecyclerView).overScrollMode =
            RecyclerView.OVER_SCROLL_NEVER
        findViewById<ImageView>(R.id.imageNext).setOnClickListener {
            if(onboardingViewPager.currentItem + 1 < onboardingItemsAdapter.itemCount){
                onboardingViewPager.currentItem += 1
            }else{
                navigateToHomeActivity()
            }
            findViewById<TextView>(R.id.textSkip).setOnClickListener{
                navigateToHomeActivity()
            }
            findViewById<MaterialButton>(R.id.buttonGetStarted).setOnClickListener{
                navigateToHomeActivity()
            }
        }

    }
    private fun navigateToHomeActivity(){
        startActivity(Intent(applicationContext,HomeActivity::class.java))
        finish()
    }

    private fun setupIndicators(){
        indicatorsContainer = findViewById(R.id.indicatorsContainer)
        val indicators = arrayOfNulls<ImageView>(onboardingItemsAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(WRAP_CONTENT,WRAP_CONTENT)
        layoutParams.setMargins(0,0,0,0)
        for(i in indicators.indices){
            indicators[i] = ImageView(applicationContext)
            indicators[i]?.let {
                it.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive_background
                    )
                )
                it.layoutParams = layoutParams
                indicatorsContainer.addView(it)
            }
        }


    }

}