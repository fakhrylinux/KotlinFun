package com.example.kotlinfun

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "0"
    }

    fun reset(view: View) {
        count = 0
        textView.text = count.toString()
    }

    fun plusOne(view: View) {
        count++
        textView.text = count.toString()
    }
}
