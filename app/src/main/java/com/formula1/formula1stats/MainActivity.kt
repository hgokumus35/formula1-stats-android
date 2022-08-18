package com.formula1.formula1stats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.formula1.formula1stats.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listeners()
    }

    private fun listeners() {
        binding.proceedToTheAppText.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainPageActivity::class.java))
        }
    }
}