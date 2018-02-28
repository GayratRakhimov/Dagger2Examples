package com.gayratrakhimov.dagger2examples.example1

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule(private var context: Context) {

    @Provides
    fun provideMyLog() = MyLog()

    @Provides
    fun provideMyToast() = MyToast(context)

}