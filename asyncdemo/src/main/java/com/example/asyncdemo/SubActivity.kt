package com.example.asyncdemo

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asyncdemo.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySubBinding
    private lateinit var myRecyclerAdapter: MyRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter(){
        myRecyclerAdapter = MyRecyclerAdapter()
        binding.rvMyRecycler.adapter = myRecyclerAdapter
        myRecyclerAdapter.userList.addAll(
            listOf(
                UserData("안"),
                UserData("녕"),
                UserData("하"),
                UserData("세"),
                UserData("요"),
                UserData("!")
            )
        )
    }
}