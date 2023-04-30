package com.kiro.lesson_1_m4.data.dataBase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.kiro.lesson_1_m4.data.model.ModelNote

@Dao
interface NoteDao {
    @Query("SELECT * FROM modelNote")
    fun getAllNote():List<ModelNote>

    @Insert
    fun addNote(model: ModelNote)

    @Delete
    fun deleteNote(model: ModelNote)

}
