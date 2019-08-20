package com.dicoding.picodiploma.mysubmission.Friend

import com.dicoding.picodiploma.mysubmission.R.drawable

object FriendData {
    private val data = arrayOf(
        arrayOf(
            "Adi Rahmat Fatchi",
            "Adi",
            drawable.photo1baru,
            "Kebumen, 20 Februari 2000",
            "Jl. Perkici VII"
        ),
        arrayOf(
            "Ajeng Santika Putri",
            "Ajeng",
            drawable.photo2,
            "Tulungagung, 14 Agustus 1999",
            "Jl Kaca D2 no.4 perumahan pondok jaya"

        ),
        arrayOf(
            "Anggarini Walyanu Arianti",
            "Rini",
            drawable.photo3,
            "Kediri, 09 Januari 2001",
            "Jl. Jeruk A8/8 PJMI"
        ),
        arrayOf(
            "Annissa Hafidzhatul Insan",
            "Sasa",
            drawable.photo4,
            "Madiun, 25 Oktober 1999",
            "Jl Pisok EA 10/14"
        ),
        arrayOf(
            "Ardian Reza Maliki",
            "Ecak",
            drawable.photo5baru,
            "Tuban, 28 Februari 2000",
            "perumahan pondok jaya"
        ),
        arrayOf(
            "Avvalla Maulidha Rachma",
            "Lala", drawable.photo6,
            "Surabaya, 24 Juli 2000",
            "Jl.wijayakusuma b1 no.3 pondok safari indah"

        ),
        arrayOf(
            "Benedictus Sandy Pradipta",
            "Sandy",
            drawable.photo7,
            "Semarang, 08 Juli 2000",
            "Jl Soka C8/2 Pondok Safari"
        ),
        arrayOf(
            "Cantika Diaz Aztiza Putri",
            "Cantika",
            drawable.pas_poto,
            "Gowa, 13 Agustus 1999",
            "Jl. Ikan terbang no. 130"
        ),
        arrayOf(
            "Dahra Cantika Andiani",
            "Dahra",
            drawable.photo9,
            "Jakarta, 25 Mei 2000",
            "Jl. Seruni, Blok D1 No.2, Pondok Safari Indah"
        ),
        arrayOf(
            "Delfy Carissa",
            "Delfy",
            drawable.photo10,
            "Pangkalpinang, 01 Maret 2001",
            "Jl. Ceger Raya no 84"
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
                friend.ttl=a[3]
                friend.alamat=a[4]
                list.add(friend)
            }
        return list
    }
}
