package com.example.fragmentproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentproject.databinding.FragmentToolbarBinding


class ToolbarFragment : Fragment() {
    private var _binding : FragmentToolbarBinding? = null
    private val binding get() = _binding!! // !! (not null 어서션): 비록 null값이 들어있을지라도 null 불가능 처럼 제약 없이 쓸수 있다.
    //컴파일 시에는 에러가 없지만 런타임때는 에러가 날수 있따.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentToolbarBinding.inflate(inflater, container, false)
        return binding.root
    }
}