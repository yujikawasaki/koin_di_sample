package com.example.kmmapplication.datasources

import org.koin.dsl.module

actual class Modules {
    actual companion object {
        actual val dataModule = module {
            factory { DataStore(get()) }
//            factory { DataStore(KMMContext()) }
        }

    }
}