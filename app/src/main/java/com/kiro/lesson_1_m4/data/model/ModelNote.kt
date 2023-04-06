package com.kiro.lesson_1_m4.data.model

import android.net.Uri

data class ModelNote(
    val image: Uri,
    val title: String,
    val description: String,
    val date: String
)
