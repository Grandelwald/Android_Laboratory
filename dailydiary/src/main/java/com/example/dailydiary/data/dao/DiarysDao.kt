package com.example.dailydiary.data.dao

import androidx.room.*
import com.example.dailydiary.data.entity.Diary

@Dao //Room에게 Dao라는 것을 알려주는
interface DiarysDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE) //같은 id에 대한 엔티티를 삽입하면 충돌하는 경우가 발생해서 onConflictstratagy를 설정해 줘야
    fun InsertDiary(diary : Diary)

    //@Query("INSERT INTO diary VALUES (:title,:content,:id)" ) : Query를 썻다면 이렇게 됫을거
    //fun InsertDiary(title:String,content:String,id:String) : 위와 똑같은 코드

    @Query("SELECT * FROM diary")
    fun getALlDiaries() : List<Diary>

    @Query("SELECT * FROM diary WHERE id = :id")
    fun getDiaryById(id : String): Diary?

    @Update
    fun updateDiary(diary: Diary)

    @Delete
    fun deleteDiary(diary: Diary)
}