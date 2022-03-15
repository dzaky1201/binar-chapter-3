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
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            val bundle = Bundle()

            bundle.putString("name", name)
            bundle.putString("address", address)

            intent.putExtras(bundle)

            startActivity(intent)
        }
    }
}