package com.dicoding.picodiploma.mysubmission

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.mysubmission.Friend.Friend
import com.dicoding.picodiploma.mysubmission.Friend.FriendData
import com.dicoding.picodiploma.mysubmission.adapter.ListFriendAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvFriend:RecyclerView
    private var list: ArrayList<Friend> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFriend = findViewById(R.id.rv_friend)
        rvFriend.setHasFixedSize(true)

        list.addAll(FriendData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvFriend.layoutManager = LinearLayoutManager(this)
        val listFriendAdapter = ListFriendAdapter(list)
        rvFriend.adapter = listFriendAdapter
    }




}
