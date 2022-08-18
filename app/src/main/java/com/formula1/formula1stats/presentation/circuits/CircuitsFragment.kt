package com.formula1.formula1stats.presentation.circuits

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.formula1.formula1stats.databinding.FragmentCircuitsBinding

class CircuitsFragment : Fragment() {

    private var _binding : FragmentCircuitsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCircuitsBinding.inflate(inflater, container, false)
        return binding.root
    }
}