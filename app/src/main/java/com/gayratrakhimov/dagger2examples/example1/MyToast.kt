package com.gayratrakhimov.dagger2examples.example1

import android.content.Context
import android.widget.Toast

class MyToast(var context: Context){

    fun show(message: String){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}