package com.formula1.formula1stats.presentation.drivers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.formula1.formula1stats.R
import com.formula1.formula1stats.databinding.FragmentDriversBinding

class DriversFragment : Fragment() {

    private var _binding: FragmentDriversBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDriversBinding.inflate(inflater, container, false)
        return binding.root
    }
}