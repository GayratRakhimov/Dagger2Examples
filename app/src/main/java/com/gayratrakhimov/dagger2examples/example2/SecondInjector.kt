package com.gayratrakhimov.dagger2examples.example2

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context

@SuppressLint("StaticFieldLeak")
object SecondInjector {

    private lateinit var context: Context
    lateinit var component: SecondComponent

    fun init(context: Context){
        if (context is Activity) {
            throw IllegalStateException("pass an Application as an argument to avoid memory leaks")
        }

        this.context = context
        component = DaggerSecondComponent.builder()
                .secondModule(SecondModule(context))
                .build()

    }

}