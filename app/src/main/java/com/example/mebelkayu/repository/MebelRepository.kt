package com.example.mebelkayu.repository

import com.example.mebelkayu.dao.Mebeldao
import com.example.mebelkayu.model.Mebel
import kotlinx.coroutines.flow.Flow

class MebelRepository(private val tireDao: Mebeldao) {
    val allmebels: Flow<List<Mebel>> =tireDao.getAllMebel()
    suspend fun insertTire(mebel: Mebel){
        tireDao.insertMebel(mebel)
    }
    suspend fun deleteMebel(mebel: Mebel){
        tireDao.deleteMebel(mebel)
    }

    suspend fun updateMebel(mebel: Mebel){
        tireDao.updateMebel(mebel)
    }
}
