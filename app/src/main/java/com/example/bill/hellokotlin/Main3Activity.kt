package com.example.bill.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

//    private var textView: TextView? = null
//    private var imageView: ImageView? = null
//    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
//        textView = findViewById(R.id.textView2) as TextView
        textView2.text = "Hello Kotlin, I am Bill"

//        imageView = findViewById(R.id.imageView) as ImageView
        /*button = findViewById(R.id.button2) as Button

        // ?和!!的区别   ?空时什么都不做,不会出现空指针 !!空时报空指针
        button!!.setOnClickListener {
            imageView!!.setImageResource(R.mipmap.ic_launcher_round)
            Toast.makeText(this@Main3Activity, "Toast", Toast.LENGTH_SHORT).show()
        }*/

        button2.setOnClickListener {
            imageView.setImageResource(R.mipmap.ic_launcher_round)
            Toast.makeText(this@Main3Activity, "Toast", Toast.LENGTH_SHORT).show()
        }

    }
}
