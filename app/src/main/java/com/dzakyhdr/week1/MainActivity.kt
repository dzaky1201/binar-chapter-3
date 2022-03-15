package com.dzakyhdr.week1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit = findViewById(R.id.button)

        btnSubmit.setOnClickListener {
            // class intent digunakan untuk navigasi antara activty
            // case yang akan kita lakukan itu dari main activity ke detail activity

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", "Ahmad Junaedi")

            startActivity(intent)
        }

    }
}