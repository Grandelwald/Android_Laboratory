package com.example.room.database

import androidx.room.*


@Dao
interface MemoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMemo(entity: MemoEntity)

    @Query("SELECT * FROM memo_table")
    fun getAllMemo(): List<MemoEntity>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateMemo(entity: MemoEntity)

    @Query("DELETE FROM memo_table WHERE idx=:idx")
    fun deleteMemo(idx : Int)

    @Query("DELETE FROM memo_table")
    fun deleteAllMemo()
}