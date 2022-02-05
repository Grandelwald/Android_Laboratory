package com.example.android_lab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_lab.databinding.FragmentSample1Binding

class SampleFragment1 : Fragment() {

    private var _binding : FragmentSample1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentSample1Binding.inflate(inflater, container, false)
        return binding.root
    }
}


