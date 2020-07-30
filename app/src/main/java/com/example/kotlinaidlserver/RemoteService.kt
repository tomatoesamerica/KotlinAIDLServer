package com.example.kotlinaidlserver

import android.app.Person
import android.app.Service
import android.content.Intent
import android.os.IBinder

class RemoteService : Service() {

    override fun onBind(intent: Intent): IBinder {
        return binder
    }


    private val binder = object : aidl.Stub() {
//        override fun getPerson(): MutableList<Person> {
//            return null
//        }
        override fun getData(): MutableList<String> {
            return getListData()
        }

        override fun sum(a: Int, b: Int): Int {
            return a + b
        }

    }

    fun getListData() : MutableList<String>{
        var strings =  ArrayList<String>()
        strings.add("apple")
        strings.add("orange")
        strings.add("lemon")
        return strings
    }
}