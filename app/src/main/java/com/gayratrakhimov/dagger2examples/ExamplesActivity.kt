package com.gayratrakhimov.dagger2examples

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.gayratrakhimov.dagger2examples.example1.Example1Activity
import kotlinx.android.synthetic.main.activity_examples.*

class ExamplesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_examples)

        var examples = arrayOf(
                Example("Example1", Example1Activity::class.java as Class<Activity>)
        )

        recycler_examples.layoutManager = LinearLayoutManager(this)
        recycler_examples.adapter = ExamplesAdapter(examples)

    }

}
