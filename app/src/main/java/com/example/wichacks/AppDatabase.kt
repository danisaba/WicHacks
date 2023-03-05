package com.example.wichacks

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MoodEntry::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun moodDao(): MoodDao
}
