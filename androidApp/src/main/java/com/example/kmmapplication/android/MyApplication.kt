package com.example.kmmapplication.android

import android.app.Application
import com.example.kmmapplication.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Log Koin into Android logger
            androidLogger()

            androidContext(this@MyApplication)
            DataModule.addKoinModules()
        }
//        DataModule.setupKoinAndroid(this@MyApplication)
    }
}