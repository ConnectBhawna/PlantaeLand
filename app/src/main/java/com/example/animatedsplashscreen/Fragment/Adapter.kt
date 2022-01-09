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
//ye adapter flowdata k liye hei but meiko isme dusra data chahiye i created diferrent adapter for flower data
class Adapter(var data: List<CardInfo>) : RecyclerView.Adapter<Adapter.viewHolder>() {


    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.title
        var priority = itemView.priority
        var layout = itemView.mylayout


    }
    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var planetimg = view.flower_img
        var galaxy= view.galaxy
        var distance = view.state



    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.view, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        when (data[position].priority?.toLowerCase()) {
            "high" -> holder.layout.setBackgroundColor(Color.parseColor("#011902"))
            "medium" -> holder.layout.setBackgroundColor(Color.parseColor("#407106"))
            "low" -> holder.layout.setBackgroundColor(Color.parseColor("#7bd10a"))

            else -> holder.layout.setBackgroundColor(Color.parseColor("#0ba0e0"))

        }

        holder.title.text = data[position].title
        holder.priority.text = data[position].priority
        holder.itemView.setOnClickListener{
            val intent= Intent(
                holder.itemView.context,
                UpdateCard::class.java
            )
            intent.putExtra("id",position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}