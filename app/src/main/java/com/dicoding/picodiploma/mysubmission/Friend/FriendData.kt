package com.dicoding.picodiploma.mysubmission.Friend

import com.dicoding.picodiploma.mysubmission.R.drawable

object FriendData {
    private val data = arrayOf(
        arrayOf(
            "Adi Rahmat Fatchi",
            "Adi",
            drawable.photo1baru
        ),
        arrayOf(
            "Ajeng Santika Putri",
            "Ajeng",
            drawable.photo2

        ),
        arrayOf(
            "Anggarini Walyanu Arianti",
            "Rini",
            drawable.photo3
        ),
        arrayOf(
            "Annissa Hafidzhatul Insan",
            "Sasa",
            drawable.photo4
        ),
        arrayOf(
            "Ardian Reza Maliki",
            "Ecak",
            drawable.photo5baru
        ),
        arrayOf(
            "Avvalla Maulidha Rachma",
            "Lala", drawable.photo6

        ),
        arrayOf(
            "Benedictus Sandy Pradipta",
            "Sandy",
            drawable.photo7
        ),
        arrayOf(
            "Cantika Diaz Aztiza Putri",
            "Cantika",
            drawable.pas_poto
        ),
        arrayOf(
            "Dahra Cantika Andiani",
            "Dahra",
            drawable.photo9
        ),
        arrayOf(
            "Delfy Carissa",
            "Delfy",
            drawable.photo10
        )
    )

    val listData:ArrayList<Friend>
    get(){
        val list = arrayListOf<Friend>()
            for (a in data){
                val friend = Friend()
                friend.name = a[0]
                friend.panggilan = a[1]
                friend.photo = a[2]
                list.add(friend)
            }
        return list
    }
}
