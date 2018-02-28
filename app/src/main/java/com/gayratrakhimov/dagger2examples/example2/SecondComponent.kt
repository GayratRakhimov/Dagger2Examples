package com.gayratrakhimov.dagger2examples.example2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(SecondModule::class))
interface SecondComponent {

    fun inject(secondActivity: SecondActivity)
    fun inject(secondActivity: ThirdActivity)

}