package com.gayratrakhimov.dagger2examples

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.listitem_example.view.*

class ExamplesAdapter(var examples: Array<Example>)
    : RecyclerView.Adapter<ExamplesAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(examples[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.listitem_example, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return examples.size
    }

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(example: Example) {
            view.title.text = example.name

            view.setOnClickListener {
                var activity = view.context as Activity
                var intent = Intent(activity, example.clazz)
                activity.startActivity(intent)
            }
        }

    }

}