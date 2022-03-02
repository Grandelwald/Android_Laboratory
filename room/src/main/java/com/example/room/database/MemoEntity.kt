package com.example.room.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo_table")
data class MemoEntity(
    @PrimaryKey(autoGenerate = true)
    val idx: Int,
    val title: String,
    val content: String
)