package com.gayratrakhimov.dagger2examples.example1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gayratrakhimov.dagger2examples.R
import javax.inject.Inject

class FirstActivity : AppCompatActivity() {

    @Inject
    lateinit var myLog: FirstLogger

    @Inject
    lateinit var myToast: FirstToaster

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var component = DaggerAppComponent.create()
        var component = DaggerFirstComponent.builder()
                .firstModule(FirstModule(this))
                .build()
        component.inject(this)

        myLog.log("Hello Dagger!")
        myToast.show("Hello Dagger!")

    }

}
