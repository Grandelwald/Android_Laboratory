package com.example.mvvmfragmentproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.mvvmfragmentproject.databinding.FragmentToolbarBinding


class ToolbarFragment : Fragment() {

    private var _binding: FragmentToolbarBinding? = null
    private val binding get() = _binding!!
    private val sampleViewModel by activityViewModels<SampleViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentToolbarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.sampleViewModel = sampleViewModel
        binding.toolbarButton.setOnClickListener {
            binding.sampleViewModel?.textChanged = binding.toolbarEdtv.text.toString()
            binding.sampleViewModel?.textSize = binding.toolbarSeekBar.progress
        }
    }
}


