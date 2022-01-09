package com.example.animatedsplashscreen.Fragment

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.animatedsplashscreen.R
import kotlinx.android.synthetic.main.create_card.*
import kotlinx.android.synthetic.main.update_card.*
import kotlinx.android.synthetic.main.update_card.create_priority
import kotlinx.android.synthetic.main.update_card.create_title

class UpdateCard : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.update_card)
        val pos=intent.getIntExtra("id",-1)
        if(pos!=-1){
            val title=DataObject.getData(pos).title
            val priority=DataObject.getData(pos).priority
            create_title.setText(title)
            create_priority.setText(priority)

            delete_button.setOnClickListener{
                DataObject.deleteData(pos)
                myIntent()
            }
            update_button.setOnClickListener{
                DataObject.updateData(pos,
                    create_title.text.toString(),
                    create_priority.text.toString()
                )
                Toast.makeText(this,title+" "+priority,Toast.LENGTH_LONG).show()
                myIntent()
            }
        }

    }
    fun myIntent(){
        val intent= Intent(this,reminderFragment::class.java)
        startActivity(intent)

    }
}