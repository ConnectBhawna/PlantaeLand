package com.example.animatedsplashscreen.Fragment

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.animatedsplashscreen.First_layout_activity
import com.example.animatedsplashscreen.R
import kotlinx.android.synthetic.main.create_card.*

class CreateCard :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_card)

        save_button.setOnClickListener {
            if (create_title.text.toString().trim { it <= ' ' }.isNotBlank()
                && create_priority.text.toString().trim { it <= ' ' }.isNotBlank()
            ) {

                val title = create_title.text.toString()// as String
                val priority = create_priority.text.toString()// as String
                DataObject.setData(title, priority)
                super.onBackPressed();
       //         val intent = Intent(this, reminderFragment::class.java)
//                startActivity(intent)
            }


        }

    }
}

