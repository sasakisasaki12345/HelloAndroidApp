package com.example.helloandroidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("マチルダ",18)
        val human2 = Human("レオン",40)


        human.say()
        human.think()
        human2.say()
        human2.think()

    }
}
