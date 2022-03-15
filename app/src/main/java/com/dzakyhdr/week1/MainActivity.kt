package com.dzakyhdr.week1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.dzakyhdr.week1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val name = binding.edtName.text.toString().trim()
            val address = binding.edtAlamat.text.toString().trim()
            val person = Person(name, address)

            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("objek1", person)

            startActivity(intent)
        }
    }
}