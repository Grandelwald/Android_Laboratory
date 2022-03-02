package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.room.database.MemoDao
import com.example.room.database.MemoDatabase
import com.example.room.database.MemoEntity

class MainActivity : AppCompatActivity() {

    private lateinit var memoDao : MemoDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        accessDatabase()
    }

    private fun accessDatabase() {
        val memoDatabase = MemoDatabase.getInstance(this)!!
        memoDao = memoDatabase.memoDao()
    }

    private val insertMemo = Runnable {
        val entity = MemoEntity(
            idx = 0,
            title = "Room 사용방법",
            content = "정말 쉬워요!"
        )
        memoDao.insertMemo(entity)
    }
}