package com.example.animatedsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import com.example.animatedsplashscreen.Fragment.myGardenFragment
import com.example.animatedsplashscreen.Fragment.reminderFragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private val reminderFragment = reminderFragment()
    private val myGardenFragment = myGardenFragment()
    private val aboutSearchFragment = com.example.animatedsplashscreen.Fragment.aboutSearchFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        replaceFragment(aboutSearchFragment)


        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_search -> replaceFragment(aboutSearchFragment)
                R.id.ic_reminder -> replaceFragment(reminderFragment)
                R.id.ic_my_garden -> replaceFragment(myGardenFragment)

            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }
    }


}