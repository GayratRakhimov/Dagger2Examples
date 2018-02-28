package com.gayratrakhimov.dagger2examples.example1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gayratrakhimov.dagger2examples.R
import javax.inject.Inject

class Example1Activity : AppCompatActivity() {

    @Inject
    lateinit var myLog: MyLog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example1)

        var component = DaggerExample1Component.create()
        component.inject(this)

        myLog.log("Hello Dagger!")

    }

}
