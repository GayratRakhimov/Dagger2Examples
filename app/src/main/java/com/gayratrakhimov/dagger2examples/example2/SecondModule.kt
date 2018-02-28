package com.gayratrakhimov.dagger2examples.example2

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SecondModule(private var context: Context) {

    @Singleton
    @Provides
    fun provideLogger() = SecondLogger()

    @Provides
    fun provideToaster() = SecondToaster(context)

}