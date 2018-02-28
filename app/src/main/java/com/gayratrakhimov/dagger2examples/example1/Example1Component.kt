package com.gayratrakhimov.dagger2examples.example1

import dagger.Component

@Component(modules = arrayOf(Example1Module::class))
interface Example1Component {

    fun inject(example1Activity: Example1Activity)

}