package com.gayratrakhimov.dagger2examples.example1

import dagger.Component

@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(mainActivity: MainActivity)

}