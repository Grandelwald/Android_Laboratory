package com.example.dailydiary.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity //Room에게 이 클래스는 다이어리에 저장할 엔티티라는 뜻
//모든 엔티티에는 식별할 수 있는 프라이머리 키(고유값)이 있어야한다
data class Diary(
    val title : String,
    val content : String,
    @PrimaryKey
    val id : String = UUID.randomUUID().toString()
)
