package com.example.animatedsplashscreen

import androidx.lifecycle.MutableLiveData
import com.example.animatedsplashscreen.Fragment.CardInfo

class TestViewModel {
    var number = 0
    val currentNumber: MutableLiveData<Int> by lazy{
        MutableLiveData<Int>()
    }
    val currentBoolean: MutableLiveData<Boolean> by lazy{
        MutableLiveData<Boolean>()
    }


}