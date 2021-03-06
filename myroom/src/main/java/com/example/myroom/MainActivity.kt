package com.example.selfstudy_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.myroom.database.User
import com.example.myroom.database.UserDatabase
import com.example.myroom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var db: UserDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 싱글톤 패턴을 사용하지 않은 경우
        db = Room.databaseBuilder(
            applicationContext,
            UserDatabase::class.java,
            "user-database"
        ).allowMainThreadQueries() // 그냥 강제로 실행
            .build()

        refreshUserList()

        binding.btnSave.setOnClickListener {
            addUser()
            refreshUserList()
        }
    }

    private fun addUser() {
        var name = binding.etName.text.toString()
        var age = binding.etAge.text.toString()
        var phone = binding.etPhone.text.toString()

        db.userDao().insert(User(name, age, phone))
    }

    private fun refreshUserList() {
        var userList = "유저 리스트\n"

        val users = db.userDao().getAll()

        for (user in users) {
            userList += "이름: ${user.name}, 나이: ${user.age}, 번호: ${user.phone}\n"
        }
        binding.tvPerson.text = userList
    }
}