package com.example.kmmapplication

import android.app.Application
import android.content.Context

actual typealias KMMContext = Application

fun KMMContext.getSp(name : String) = getSharedPreferences(name, Context.MODE_PRIVATE)