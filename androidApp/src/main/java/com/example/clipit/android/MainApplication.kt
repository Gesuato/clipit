package com.example.clipit.android

import android.app.Application
import com.example.clipit.initKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}