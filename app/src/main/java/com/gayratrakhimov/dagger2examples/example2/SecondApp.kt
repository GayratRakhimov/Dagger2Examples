package com.gayratrakhimov.dagger2examples.example2

import android.app.Application

class SecondApp : Application(){

    override fun onCreate() {
        super.onCreate()
        SecondInjector.init(this)
    }

}