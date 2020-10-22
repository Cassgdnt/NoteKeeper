package com.example.makeroom.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.makeroom.models.EmployeeEntity


@Database(entities=[EmployeeEntity::class], version =1)
abstract class AppDb :RoomDatabase(){
    abstract fun empDao(): EmpDao
}