package com.dev.reachforhelp.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _notificationList = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val notificationList: LiveData<String> = _notificationList
}