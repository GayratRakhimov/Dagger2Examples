package com.gayratrakhimov.dagger2examples.example2

import android.app.Application

class App : Application(){

    override fun onCreate() {
        super.onCreate()
        Injector.init(this)
    }

}