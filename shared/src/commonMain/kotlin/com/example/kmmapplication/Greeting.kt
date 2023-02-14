package com.example.kmmapplication

import com.example.kmmapplication.datasources.DataStore
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Greeting : KoinComponent {
    private val platform: Platform = getPlatform()

//    fun greet(): String {
//        return "Hello, ${platform.name}!"
//    }


    private val _dataSource : DataStore by inject()
    fun greet(): String {
//        val a = _dataSource == null
//        return "Hello, ${a}!"
        return "Hello, ${_dataSource.log()}!"
    }
}