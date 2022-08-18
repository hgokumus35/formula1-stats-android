package com.formula1.formula1stats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContentProviderCompat.requireContext
import com.formula1.formula1stats.databinding.ActivityMainPageBinding
import com.formula1.formula1stats.util.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainPageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.formulaViewPager
        val tabLayout = binding.tabLayout
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when(position) {
                0 -> tab.setIcon(R.drawable.helmet)
                1 -> tab.setIcon(R.drawable.racing_car)
                2 -> tab.setIcon(R.drawable.circuit)
            }
        }.attach()

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