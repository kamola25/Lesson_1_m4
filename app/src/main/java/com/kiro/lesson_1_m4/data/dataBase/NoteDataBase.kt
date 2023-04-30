package com.kiro.lesson_1_m4.data.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kiro.lesson_1_m4.data.model.ModelNote

@Database(entities = [ModelNote::class], version = 1)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun getDao():NoteDao

    companion object{
    @Volatile
    private var INSTANCE : NoteDataBase? = null
    private val LOCK = Any()

        operator fun invoke(context: Context)= INSTANCE?: synchronized(LOCK){
            INSTANCE?: buildDataBase(context).also {
                INSTANCE = it
            }
        }
        private fun buildDataBase(context:Context)=
            Room.databaseBuilder(
                context.applicationContext,
                NoteDataBase::class.java,
                "DATABASE_NAME"
            ).allowMainThreadQueries().build()
}}