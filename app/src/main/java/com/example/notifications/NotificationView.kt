package com.example.notifications

import android.app.Activity
import android.os.Bundle


class NotificationView : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notification)
    }
}