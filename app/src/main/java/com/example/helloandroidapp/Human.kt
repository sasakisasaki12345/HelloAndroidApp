package com.example.helloandroidapp

import android.util.Log

open class Human :Animal,Thinkable {

    var hobby:String = "映画"

    constructor(name:String,age:Int):super(name,age){}

    override fun say() {
        Log.d("kotlintest","私の名前は"+name+"です。年は"+age+"歳です。")
    }

    override fun think() {
        Log.d("kotlintest","私は"+hobby+"について考える。")
    }

}