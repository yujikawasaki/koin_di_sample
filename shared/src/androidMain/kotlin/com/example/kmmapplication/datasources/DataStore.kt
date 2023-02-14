package com.example.kmmapplication.datasources

import android.content.SharedPreferences
import com.example.kmmapplication.KMMContext
import com.example.kmmapplication.Platform
import com.example.kmmapplication.getPlatform

actual class DataStore actual constructor(val context: KMMContext) {
    val SP_NAME = "kmm_app"
    val sp : SharedPreferences

    init {
        sp = context.getSharedPreferences(SP_NAME, 0)
    }

    actual fun log(): String {
        sp.edit().putString("LOG", "log!!!!").apply()

        return sp.getString("LOG", "???") ?: "例外"
    }
}