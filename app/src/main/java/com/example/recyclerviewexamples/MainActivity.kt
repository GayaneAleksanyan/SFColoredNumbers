package com.example.recyclerviewexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = MyAdapter()
        recyclerView.adapter = adapter
//        recyclerView.addItemDecoration(ItemOffsetsDecoration(this))
        recyclerView.addItemDecoration(MyItemDecoration())

//        val anim = AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation)
//        recyclerView.layoutAnimation = anim
//        recyclerView.scheduleLayoutAnimation()
    }
}