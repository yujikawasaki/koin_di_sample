package com.example.kmmapplication.datasources

import android.content.SharedPreferences
import com.example.kmmapplication.KMMContext
import com.example.kmmapplication.Platform
import com.example.kmmapplication.getPlatform
import com.example.kmmapplication.getSp

actual class DataStore actual constructor(val context: KMMContext) {
    private val SP_NAME = "kmm_app"
    private val sp = context.getSp(SP_NAME)

    actual fun getData(): String {
        sp.edit().putString("LOG", "log!!!!").apply()

        return sp.getString("LOG", "???") ?: "例外"
    }
}