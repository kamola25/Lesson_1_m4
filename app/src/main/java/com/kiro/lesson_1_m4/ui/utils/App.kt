package com.kiro.lesson_1_m4.ui.utils

import android.app.Application
import android.content.SharedPreferences
import com.kiro.lesson_1_m4.data.dataBase.NoteDataBase

class App : Application() {
    private lateinit var preferences: SharedPreferences

    companion object {
        lateinit var prefs: Prefs
        lateinit var db: NoteDataBase
    }

    override fun onCreate() {
        super.onCreate()
        preferences = this.applicationContext
            .getSharedPreferences("settings", MODE_PRIVATE)
        prefs = Prefs(preferences)
        db = NoteDataBase(this)
    }
}