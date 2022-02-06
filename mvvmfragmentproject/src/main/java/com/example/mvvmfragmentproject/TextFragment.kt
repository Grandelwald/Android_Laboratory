package com.example.mvvmfragmentproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.mvvmfragmentproject.databinding.FragmentTextBinding


class TextFragment : Fragment() {

    private var _binding : FragmentTextBinding? = null
    private val binding get() = _binding!!
    private val sampleViewModel by activityViewModels<SampleViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTextBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.sampleViewModel = sampleViewModel
    }
}