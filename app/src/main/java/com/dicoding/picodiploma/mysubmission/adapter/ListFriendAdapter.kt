package com.dicoding.picodiploma.mysubmission.adapter

import android.annotation.SuppressLint

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.mysubmission.Friend.Friend
import com.dicoding.picodiploma.mysubmission.R


class ListFriendAdapter(private val listFriend:ArrayList<Friend>): RecyclerView.Adapter<ListFriendAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_friend,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFriend.size
    }

    @SuppressLint("ResourceType")
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name,panggilan,photo) = listFriend[position]
        holder.tvName.text = name.toString()
        holder.tvNamePanggilan.text = panggilan.toString()
        holder.tvImg.setImageResource(photo.toString().toInt())
    }

    inner class ListViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvNamePanggilan: TextView = itemView.findViewById(R.id.tv_item_panggilan)
        var tvImg: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}