package com.gayratrakhimov.dagger2examples.example2

import android.util.Log

class SecondLogger {

    init {
        log("New SecondLogger instance created")
    }

    fun log(message: String){
        Log.d("DaggerTag", message)
    }

}