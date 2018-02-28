package com.gayratrakhimov.dagger2examples.example1

import dagger.Component

@Component(modules = arrayOf(FirstModule::class))
interface FirstComponent {

    fun inject(firstActivity: FirstActivity)

}