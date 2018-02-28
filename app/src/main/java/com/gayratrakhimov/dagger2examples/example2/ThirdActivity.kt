package com.gayratrakhimov.dagger2examples.example2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gayratrakhimov.dagger2examples.R
import javax.inject.Inject

class ThirdActivity : AppCompatActivity() {

    @Inject
    lateinit var secondLogger: SecondLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        Injector.component.inject(this)

        secondLogger.log("This is third activity")

    }

}
