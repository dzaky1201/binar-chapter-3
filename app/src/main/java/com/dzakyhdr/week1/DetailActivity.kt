package com.dzakyhdr.week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.dzakyhdr.week1.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val data = intent.getStringExtra("name") // ahmad junaedi
        Log.d("DetailActivity", data.toString())


    }
}