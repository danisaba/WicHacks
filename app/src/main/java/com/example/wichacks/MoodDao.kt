package com.example.wichacks

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MoodDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<MoodEntry>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<MoodEntry>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): MoodEntry

    @Insert
    fun insertAll(vararg users: MoodEntry)

    @Delete
    fun delete(user: MoodEntry)
}
