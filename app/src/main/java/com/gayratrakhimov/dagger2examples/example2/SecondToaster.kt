package com.gayratrakhimov.dagger2examples.example2

import android.content.Context
import android.widget.Toast

class SecondToaster(var context: Context){

    fun show(message: String){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}