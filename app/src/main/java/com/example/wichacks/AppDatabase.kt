package com.example.wichacks

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SymptomEntry::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun symptomDao(): SymptomDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null
    }

    fun getDatabase(context: Context): AppDatabase {
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "valkrie_db")
                .createFromAsset("database/valkrie.db")
                .build()
            INSTANCE = instance

            instance
        }
    }

}
