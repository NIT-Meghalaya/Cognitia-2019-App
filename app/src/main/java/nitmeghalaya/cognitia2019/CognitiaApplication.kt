package nitmeghalaya.cognitia2019

import android.app.Application
import appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CognitiaApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@CognitiaApplication)
            modules(listOf(appModule))
        }
    }
}