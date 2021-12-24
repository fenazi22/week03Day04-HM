package com.example.week03day04_hm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectView()
        prepareView()
    }

    private fun connectView(){recyclerView = findViewById(R.id.recycler)}
    private fun prepareView(){
        val array:ArrayList<Mobile> = ArrayList()
        array.add(Mobile("honor","mobile from Haweuwei",R.drawable.honor))
        array.add(Mobile("huaweimaters","maters1",R.drawable.huaweimaters))
        array.add(Mobile("huaweinov","nov", R.drawable.huaweinov))
        array.add(Mobile("huaweip","ip", R.drawable.huaweip))
        array.add(Mobile("iphone","iphone", R.drawable.iphone))
        array.add(Mobile("lenovomoto","omoto", R.drawable.lenovomoto))
        array.add(Mobile("nokia","nokia", R.drawable.nokia))
        array.add(Mobile("note","note", R.drawable.note))
        array.add(Mobile("p","p", R.drawable.p))
        array.add(Mobile("viv","viv", R.drawable.viv))

            val customAdapter:CustomAdapter =CustomAdapter(array)
        recyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView?.adapter = customAdapter
    }
}