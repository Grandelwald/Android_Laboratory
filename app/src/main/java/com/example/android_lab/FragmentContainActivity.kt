package com.example.android_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.android_lab.databinding.ActivityFragmentContainBinding

class FragmentContainActivity : FragmentActivity() {
    private lateinit var binding: ActivityFragmentContainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentContainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}