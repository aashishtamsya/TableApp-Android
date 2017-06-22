package com.aashishtamsya.tablesapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateButton.setOnClickListener(View.OnClickListener { _ ->
            val number = Integer.parseInt(numberField.text.toString())
            val multiplier = Integer.parseInt(multiplierField.text.toString())

            populateListView(number, multiplier)
        })

    }

    private fun populateListView(number: Int, multiplier: Int) {

        val results = mutableListOf<String>()

        for (index in 1..multiplier) {
            results.add("$number * $index = ${number*index}")
        }


        val adapter: ArrayAdapter<String> = ArrayAdapter(this, R.layout.item, results)

        listView.adapter = adapter

    }
}
