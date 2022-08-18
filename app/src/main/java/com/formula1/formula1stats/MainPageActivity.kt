package com.formula1.formula1stats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.formula1.formula1stats.databinding.ActivityMainPageBinding
import com.google.android.material.tabs.TabLayout

class MainPageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainPageBinding

    lateinit var tab: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listeners()
    }

    private fun listeners() {
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> binding.toolbarText.text = getString(R.string.drivers)
                    1 -> binding.toolbarText.text = getString(R.string.teams)
                    2 -> binding.toolbarText.text = getString(R.string.circuits)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }


}