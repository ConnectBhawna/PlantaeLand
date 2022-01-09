package com.example.animatedsplashscreen.Fragment

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.animatedsplashscreen.R
import kotlinx.android.synthetic.main.view.view.*
import kotlinx.android.synthetic.main.view.view.title
import kotlinx.android.synthetic.main.view1.view.*

class Adapter1(var flower:List<FlowerData>) : RecyclerView.Adapter<Adapter1.myViewHolder>() {

    class myViewHolder(view1: View) : RecyclerView.ViewHolder(view1) {
        var title = view1.title
        var planetimg = view1.flower_img
        var galaxy= view1.galaxy
        var distance = view1.state



    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter1.myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view1,parent,false)

        return Adapter1.myViewHolder(itemView)

    }



    override fun getItemCount(): Int {
        return flower.size
    }

    override fun onBindViewHolder(holder: Adapter1.myViewHolder, position: Int){
        var dummyImage:Int?=null
        holder.title.text=flower[position].title
        holder.galaxy.text=flower[position].galaxy
        holder.distance.text=flower[position].distance

        when(flower[position].title?.toLowerCase()){
            "rose"->{
                dummyImage=R.drawable.rose
            }
            "sunflower"->{
                dummyImage=R.drawable.sunflower
            }
            "tulip"->{
                dummyImage=R.drawable.tulip
            }
            "marigold"->{
                dummyImage=R.drawable.marigold
            }
            "magnolia"->{
                dummyImage=R.drawable.magnolia
            }
            "lavender"->{
                dummyImage=R.drawable.lavender
            }
            "jaismine"->{
                dummyImage=R.drawable.jaismine
            }
            "daisy"->{
                dummyImage=R.drawable.daisy
            }
        }
      //  holder.planetimg.setImageResource(dummyImage!!)

    }


}
