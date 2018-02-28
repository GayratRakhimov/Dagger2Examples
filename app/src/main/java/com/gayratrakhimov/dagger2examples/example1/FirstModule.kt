package com.gayratrakhimov.dagger2examples.example1

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class FirstModule(private var context: Context) {

    @Provides
    fun provideLogger() = FirstLogger()

    @Provides
    fun provideToaster() = FirstToaster(context)

}