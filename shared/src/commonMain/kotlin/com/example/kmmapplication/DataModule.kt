package com.example.kmmapplication

import com.example.kmmapplication.datasources.Modules
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

class DataModule {

    companion object {
//        private val dataModule = module {
////            factory { DataStore(get()) }
//            factory { DataStore(KMMContext()) }
//        }

        // initKoinだと、 iOSビルドでエラーとなる。
        // error: value of type 'DataModule.Companion' has no member 'initKoin'
        // - https://insert-koin.io/docs/reference/koin-mp/kmp
        // do prefix をつければいけるみたい。
        fun initKoin(context: KMMContext) {
            startKoin {
                modules(
                    listOf(
                        //module { single { context }}, // NSObject は登録できない
                        Modules.dataModule,
                    )
                )
            }
        }

        // for Android
        // app: モジュールで Koin 使う場合は、こちらを呼び出してモジュールを追加する
        fun addKoinModules() {
            loadKoinModules(Modules.dataModule)
        }

//        fun setupKoinAndroid(context: KMMContext) {
//            // 空
//            setupKoin(module { factory { context } })
//        }
//        // for Android
//        // app: モジュールで Module読み込みが必要な場合は、こちらで実施
//        fun setupKoin(context: Module) {
//            startKoin {
//                modules(
//                    listOf(
//                        Modules.dataModule,
//                        context
//                    )
//                )
//            }
//        }
    }
}