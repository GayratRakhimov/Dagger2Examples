package com.gayratrakhimov.dagger2examples.example1

import dagger.Module
import dagger.Provides

@Module
class Example1Module {

    @Provides
    fun provideMyLog() = MyLog()

}