package com.dicoding.picodiploma.mysubmission

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class DetailActivity: AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val tvGetNama : TextView = findViewById(R.id.tv_item_name)
        val tvGetPanggilan : TextView = findViewById(R.id.tv_item_panggilan)
        val tvGetImg : ImageView = findViewById(R.id.img_item_photo)
        val tvGetTtl : TextView = findViewById(R.id.tv_item_ttl)
        val tvGetAlamat : TextView = findViewById(R.id.tv_item_alamat)
        val hubungi :Button = findViewById(R.id.hubungi)
        hubungi.setOnClickListener(this)


        val nama= intent.getStringExtra(EXTRA_NAME)
        val panggilan = intent.getStringExtra(EXTRA_PANGGILAN)
        val ttl = intent.getStringExtra(EXTRA_TTL)
        val alamat = intent.getStringExtra(EXTRA_ALAMAT)
        val photo = intent.getIntExtra(EXTRA_IMG,0)

        tvGetNama.text = nama
        tvGetPanggilan.text = panggilan
        tvGetTtl.text = ttl
        tvGetAlamat.text = alamat
        tvGetImg.setImageResource(photo.toString().toInt())

    }

    override fun onClick(v:View){
        if(v.id==R.id.hubungi){
            Toast.makeText(this,"fitur belum ada!!",Toast.LENGTH_SHORT).show()
        }
    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_PANGGILAN = "extra_nama_panggilan"
        const val EXTRA_ALAMAT = "extra_alamat"
        const val EXTRA_TTL = "extra_ttl"
    }
}