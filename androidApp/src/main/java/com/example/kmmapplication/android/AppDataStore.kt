package com.example.kmmapplication.android

import android.content.Context
import com.example.kmmapplication.datasources.IAppDataStore

class AppDataStore(val context: Context): IAppDataStore {
    private val SP_NAME = "app_setting"
    private val sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE)

    override fun getData(): String {
        sp.edit().putString("LOG", "app data!!").apply()

        return sp.getString("LOG", "???") ?: "例外"
    }
}