package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val versionOfAndroid : MutableList<String> = mutableListOf()
        versionOfAndroid.add("Android 4 Ice Cream Sandwich")
        versionOfAndroid.add("Android 4.1 Jelly Bean")
        versionOfAndroid.add("Android 4.4 KitKat")
        versionOfAndroid.add("Android 5 Lollipop")
        versionOfAndroid.add("Android 6 Marshmallow")
        versionOfAndroid.add("Android 7 Nougat")
        versionOfAndroid.add("Android 8 Oreo")
        versionOfAndroid.add("Android 9 Pie")
        versionOfAndroid.add("Android 10 Q")

        val adapter =  Adapter(versionOfAndroid)

        val rvLista = findViewById<RecyclerView>(R.id.listColorAndroid)
        rvLista.adapter = adapter
        rvLista.layoutManager = LinearLayoutManager(this)



    }




}