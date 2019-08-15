package com.dicoding.picodiploma.mysubmission.Friend

object FriendData {
    private val data = arrayOf(
        arrayOf(
            "Adi Rahmat Fatchi",
            "Adi"
        ),
        arrayOf(
            "Ajeng Santika Putri",
            "Ajeng"
        ),
        arrayOf(
            "Anggarini Walyanu Arianti",
            "Rini"
        ),
        arrayOf(
            "Annissa Hafidzhatul Insan",
            "Sasa"
        ),
        arrayOf(
            "Ardian Reza Maliki",
            "Ecak"
        ),
        arrayOf(
            "Avvalla Maulidha Rachma",
            "Lala"
        ),
        arrayOf(
            "Benedictus Sandy Pradipta",
            "Sandy"
        ),
        arrayOf(
            "Cantika Diaz Aztiza Putri",
            "Cantika"
        ),
        arrayOf(
            "Dahra Cantika Andiani",
            "Dahra"

        ),
        arrayOf(
            "Delfy Carissa",
            "Delfy"

        ),
        arrayOf(
            "Dimas Rakawibowo",
            "Dimas"

        )
    )

    val listData:ArrayList<Friend>
    get(){
        val list = arrayListOf<Friend>()
            for (a in data){
                val friend = Friend()
                friend.name = a[0]
                friend.panggilan = a[1]
                list.add(friend)
            }
        return list
    }
}
