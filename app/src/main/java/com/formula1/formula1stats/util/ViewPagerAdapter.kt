package com.formula1.formula1stats.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.formula1.formula1stats.presentation.circuits.CircuitsFragment
import com.formula1.formula1stats.presentation.drivers.DriversFragment
import com.formula1.formula1stats.presentation.teams.TeamsFragment

private const val NUM_TABS = 3

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return DriversFragment()
            1 -> return TeamsFragment()
        }
        return CircuitsFragment()
    }
}