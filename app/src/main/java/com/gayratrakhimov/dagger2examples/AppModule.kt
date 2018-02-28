package com.gayratrakhimov.dagger2examples

import android.content.Context
import com.gayratrakhimov.dagger2examples.example1.MyLog
import com.gayratrakhimov.dagger2examples.example1.MyToast
import dagger.Module
import dagger.Provides

@Module
class AppModule(private var context: Context) {

    @Provides
    fun provideMyLog() = MyLog()

    @Provides
    fun provideMyToast() = MyToast(context)

}