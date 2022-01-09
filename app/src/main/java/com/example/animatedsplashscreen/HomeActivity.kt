package com.example.animatedsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.animatedsplashscreen.Fragment.aboutSearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.animatedsplashscreen.Fragment.reminderFragment
import com.example.animatedsplashscreen.Fragment.myGardenFragment
class HomeActivity : AppCompatActivity() {

    //isme problem aa rhi hai reminder fragment mai kuch time pehle shi chal rha tha aab problem aa rhi

    private val aboutSearchFragment = aboutSearchFragment()
    private val reminderFragment = reminderFragment()
    private val myGardenFragment = myGardenFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        replaceFragment(aboutSearchFragment)


        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_search -> replaceFragment(aboutSearchFragment)
                R.id.ic_reminder -> replaceFragment(reminderFragment)
                R.id.ic_my_garden -> replaceFragment(myGardenFragment)

            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }


}