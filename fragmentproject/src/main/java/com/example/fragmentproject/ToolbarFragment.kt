package com.example.fragmentproject

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import com.example.fragmentproject.databinding.FragmentToolbarBinding
import java.lang.ClassCastException


class ToolbarFragment : Fragment(), SeekBar.OnSeekBarChangeListener {
    private var _binding : FragmentToolbarBinding? = null
    private val binding get() = _binding!! // !! (not null 어서션): 비록 null값이 들어있을지라도 null 불가능 처럼 제약 없이 쓸수 있다.
    //컴파일 시에는 에러가 없지만 런타임때는 에러가 날수 있따.
    var seekvalue = 10
    var activityCallback: ToolbarFragment.ToolbarListener? = null

    interface ToolbarListener {
        fun onBuuttonClick(position: Int, text: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            activityCallback = context as ToolbarListener
        } catch (e: ClassCastException) {
            throw ClassCastException(context.toString() + "must implement ToolbarListener")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentToolbarBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.seekBar1.setOnSeekBarChangeListener(this)
        binding.button1.setOnClickListener { v: View -> buttonnClicked(v) }
    }

    private fun buttonnClicked(view: View){
    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        seekvalue = progress
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
    }

    private fun buttonClicked(view: View){
        activityCallback?.onBuuttonClick(seekvalue, binding.editText1.text.toString())
    }

}