package com.example.kmmapplication

import com.example.kmmapplication.datasources.DataStore
import com.example.kmmapplication.datasources.Modules
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class DataModule {

    companion object {
//        private val dataModule = module {
////            factory { DataStore(get()) }
//            factory { DataStore(KMMContext()) }
//
////            factory { DataStore(androidContext()) }
//        }

        // for iOS
        // initKoinだと、 init から始まるメソッド名だとビルドエラーになる。
        // error: value of type 'DataModule.Companion' has no member 'initKoin'
        // - https://insert-koin.io/docs/reference/koin-mp/kmp
        // do prefix をつければいけるいたい。
        fun setupKoiniOS(context: KMMContext) {
//            setupKoin(module { factory { context }})
            startKoin {
                modules(
                    listOf(
                        //module { single { context }}, // NSObject は登録できない
                        Modules.dataModule,
                    )
                )
            }
        }

        fun setupKoinAndroid(context: KMMContext) {
            // 空
            setupKoin(module { factory { context } })
        }

        // for Android
        // app: モジュールで Module読み込みが必要な場合は、こちらで実施
        fun setupKoin(context: Module) {
            startKoin {
                modules(
                    listOf(
                        Modules.dataModule,
                        context
                    )
                )
            }
        }
    }
}