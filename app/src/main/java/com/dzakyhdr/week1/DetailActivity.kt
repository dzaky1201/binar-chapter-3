package com.dzakyhdr.week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dzakyhdr.week1.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        val name = bundle?.getString("name")
        val address = bundle?.getString("address")

        binding.txtName.text = name
        binding.txtAlamat.text = address




    }
}