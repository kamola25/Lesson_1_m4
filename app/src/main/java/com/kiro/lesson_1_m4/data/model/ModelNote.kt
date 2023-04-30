package com.kiro.lesson_1_m4.data.model

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ModelNote(
    @PrimaryKey(autoGenerate = true) var id : Int? = null,
    var image: String,
    var title: String,
    var description: String,
    var date: String
)
