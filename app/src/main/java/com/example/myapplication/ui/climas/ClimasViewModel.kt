package com.example.myapplication.ui.climas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ClimasViewModel {

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    val text: LiveData<String> = _text
}