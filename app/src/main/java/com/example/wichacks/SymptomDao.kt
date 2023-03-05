package com.example.wichacks

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SymptomDao {
    @Query("SELECT * FROM day")
    fun getAll(): List<SymptomEntry>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<SymptomEntry>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): SymptomEntry

    @Insert
    fun insertAll(vararg users: SymptomEntry)

    @Delete
    fun delete(user: SymptomEntry)
}
