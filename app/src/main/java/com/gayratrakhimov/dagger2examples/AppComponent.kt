package com.gayratrakhimov.dagger2examples

import dagger.Component

@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(mainActivity: MainActivity) {}
}