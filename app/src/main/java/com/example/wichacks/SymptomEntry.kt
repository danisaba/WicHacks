package com.example.wichacks

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SymptomEntry(
    @PrimaryKey val day: Long,
    @ColumnInfo(name = "cramp") val cramp: Boolean?,
    @ColumnInfo(name = "bloat") val bloat: Boolean?,
    @ColumnInfo(name = "tender") val tender: Boolean?,
    @ColumnInfo(name = "headache") val headache: Boolean?,
    @ColumnInfo(name = "fatigue") val fatigue: Boolean?,
    @ColumnInfo(name = "hungry") val hungry: Boolean?,
    @ColumnInfo(name = "libido") val libido: Boolean?,
    @ColumnInfo(name = "acne") val acne: Boolean?
)
