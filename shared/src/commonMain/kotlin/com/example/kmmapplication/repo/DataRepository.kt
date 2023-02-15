package com.example.kmmapplication.repo

import com.example.kmmapplication.datasources.IAppDataStore

class DataRepository (private val appDataStore: IAppDataStore) {

    fun getData(): String {
        return appDataStore.getData()
    }
}