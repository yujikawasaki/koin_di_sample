package com.example.kmmapplication.datasources

import com.example.kmmapplication.KMMContext
import platform.Foundation.NSUserDefaults

actual class DataStore actual constructor(val context: KMMContext) {

    actual fun getData(): String{
//        return "iOS 123"
        NSUserDefaults.standardUserDefaults.setObject("iOS 12345", "key")

        return NSUserDefaults.standardUserDefaults.stringForKey("key") ?: "例外"
    }
}