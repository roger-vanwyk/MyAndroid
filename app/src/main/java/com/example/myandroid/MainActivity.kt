package com.example.myandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

/*
* Created by Roger on 01/11/2021
* */
class MainActivity : AppCompatActivity() {

    private lateinit var photoAdapter : PhotoAdapter
    private var dataList = mutableListOf<DataModel>()
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Title", "Desc", R.drawable.ic_baseline_book_online_24))
        dataList.add(DataModel("Title", "Desc", R.drawable.ic_baseline_book_online_24))
        dataList.add(DataModel("Title", "Desc", R.drawable.ic_baseline_book_online_24))
        dataList.add(DataModel("Title", "Desc", R.drawable.ic_baseline_book_online_24))
        dataList.add(DataModel("Title", "Desc", R.drawable.ic_baseline_book_online_24))
        dataList.add(DataModel("Title", "Desc", R.drawable.ic_baseline_book_online_24))

        photoAdapter.setDataList(dataList)
    }
}