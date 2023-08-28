package com.example.jp.ui.theme

import android.app.Application
import android.os.Build

class RunningApp:Application() {

    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            
        }
    }
}