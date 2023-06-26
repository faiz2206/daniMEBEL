package com.example.mebelkayu.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.mebelkayu.model.Mebel
import java.util.concurrent.Flow
import kotlin.collections.List as List


@Dao
interface Mebeldao {
    @Query("SELECT * FROM mebel_table ORDER BY name ASC")
    fun  getAllMebel():kotlinx.coroutines.flow.Flow<List<Mebel>>

    @Insert
    suspend fun  insertMebel(mebel: Mebel)

    @Delete
    suspend fun deleteMebel(mebel: Mebel)

    @Update fun updateMebel(mebel: Mebel)
}
