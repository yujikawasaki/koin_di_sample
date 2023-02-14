package com.example.kmmapplication

import android.app.Application

actual typealias KMMContext = Application

fun KMMContext.getSp(name : String) = getSharedPreferences(name, 0)