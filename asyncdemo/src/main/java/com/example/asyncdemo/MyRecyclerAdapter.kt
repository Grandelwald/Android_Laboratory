package com.example.asyncdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asyncdemo.databinding.ActivityMainBinding
import com.example.asyncdemo.databinding.ActivitySubBinding
import com.example.asyncdemo.databinding.ItemExampleListBinding

class MyRecyclerAdapter : RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {
    val userList = mutableListOf<UserData>()

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemExampleListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder, position: Int) {
        viewHolder.onBind(userList[position])
    }

    class MyViewHolder(private val binding: ItemExampleListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data : UserData){
            binding.tvMyText.text = data.text
        }
    }
}