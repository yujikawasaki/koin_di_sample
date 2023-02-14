package com.example.kmmapplication.datasources

import com.example.kmmapplication.KMMContext

expect class DataStore(context: KMMContext) {

    fun log(): String
}