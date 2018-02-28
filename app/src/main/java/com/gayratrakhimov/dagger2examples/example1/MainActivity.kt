package com.gayratrakhimov.dagger2examples.example1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gayratrakhimov.dagger2examples.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var myLog: MyLog

    @Inject
    lateinit var myToast: MyToast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var component = DaggerAppComponent.create()
        var component = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
        component.inject(this)

        myLog.log("Hello Dagger!")
        myToast.show("Hello Dagger!")

    }

}
