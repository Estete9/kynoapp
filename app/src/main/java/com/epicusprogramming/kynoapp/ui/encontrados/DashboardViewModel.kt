package com.epicusprogramming.kynoapp.ui.encontrados

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is encontrados Fragment"
    }
    val text: LiveData<String> = _text
}