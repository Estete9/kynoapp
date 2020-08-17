package com.epicusprogramming.kynoapp.ui.adopcion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is adopcion Fragment"
    }
    val text: LiveData<String> = _text
}