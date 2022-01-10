package com.example.animatedsplashscreen.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.animatedsplashscreen.R
import com.example.animatedsplashscreen.TestViewModel
import kotlinx.android.synthetic.main.fragment_my_garden.*

class myGardenFragment : Fragment() {

    lateinit var viewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    //    viewModel = ViewModelProvider(this).get(TestViewModel::class.java)

        viewModel.currentNumber.observe(this, Observer {
            textView.text = it.toString()

        })

        viewModel.currentBoolean.observe(this, Observer {
            textHello.text=it.toString()
        })

        increamentText()


    }
    private fun increamentText(){
        btnAddPlant.setOnClickListener{
            viewModel.currentNumber.value = ++viewModel.number
            viewModel.currentBoolean.value = viewModel.number %2 == 0

        }
    }




}

