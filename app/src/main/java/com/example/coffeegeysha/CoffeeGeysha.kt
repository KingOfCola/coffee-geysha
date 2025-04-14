package com.example.coffeegeysha

import android.app.Application
import timber.log.Timber

class CoffeeGeysha: Application() {
    override fun onCreate() {
        super.onCreate()


        Timber.plant(Timber.DebugTree())
    }
}