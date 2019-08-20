package com.dicoding.picodiploma.mysubmission

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.mysubmission.Friend.Friend
import com.dicoding.picodiploma.mysubmission.Friend.FriendData
import com.dicoding.picodiploma.mysubmission.adapter.ListFriendAdapter

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var rvFriend:RecyclerView
    private var list: ArrayList<Friend> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFriend = findViewById(R.id.rv_friend)
        rvFriend.setOnClickListener(this)
        rvFriend.setHasFixedSize(true)

        list.addAll(FriendData.listData)
        showRecyclerList()
    }

    private fun moveActivity(friend: Friend){
        val moveWithData = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithData.putExtra(DetailActivity.EXTRA_NAME, friend.name.toString())
        moveWithData.putExtra(DetailActivity.EXTRA_PANGGILAN,friend.panggilan.toString())
        moveWithData.putExtra(DetailActivity.EXTRA_TTL, friend.ttl.toString())
        moveWithData.putExtra(DetailActivity.EXTRA_ALAMAT, friend.alamat.toString())
        moveWithData.putExtra(DetailActivity.EXTRA_IMG, friend.photo.toString().toInt())
        startActivity(moveWithData)
    }

    private fun showRecyclerList(){
        rvFriend.layoutManager = LinearLayoutManager(this)
        val listFriendAdapter = ListFriendAdapter(list)
        rvFriend.adapter = listFriendAdapter

        listFriendAdapter.setOnItemClickCallback(object :ListFriendAdapter.OnItemClickCallback{
            override fun onItemClicked(data:Friend){
                moveActivity(data)
            }
        })
    }




}
