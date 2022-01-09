package com.example.animatedsplashscreen.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.animatedsplashscreen.R
import kotlinx.android.synthetic.main.fragment_about_search.*
import kotlinx.android.synthetic.main.fragment_reminder.*


class aboutSearchFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        btnStartExplore.setOnClickListener {
//
//            val intent = Intent(
//                requireContext(),
//                CreateCard::class.java
//            )
//            startActivity(intent)
//
//        }



        my_recycler.adapter = Adapter1(setData.SetFlower())
        my_recycler.layoutManager = LinearLayoutManager(requireContext())


    }



}