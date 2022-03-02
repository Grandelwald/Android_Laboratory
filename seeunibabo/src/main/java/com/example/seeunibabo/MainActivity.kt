package com.example.seeunibabo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seeunibabo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //버튼을 클릭하면 타이머 화면으로 가
        binding.buttonGoingToTimerActivity.setOnClickListener {

            //타이머 화면으로 이동해라

            val intent = Intent(this, TimerActivity::class.java) // 화면을 따로따로 만들어서 연결이 안되니까 , 연결러?를 만듦
            startActivity(intent)
        }

    }
}
