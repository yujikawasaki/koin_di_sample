package com.example.kmmapplication.datasources

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

expect class Modules {

    companion object {
        val dataModule: Module
    }
}