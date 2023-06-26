package com.example.mebelkayu.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "Mebel_table")
data class Mebel (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val address:String
) : Parcelable


