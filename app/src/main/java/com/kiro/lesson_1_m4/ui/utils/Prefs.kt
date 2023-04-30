package com.kiro.lesson_1_m4.ui.utils

import android.content.SharedPreferences

class Prefs(private val preferences: SharedPreferences) {

    fun saveBoardState() {
        preferences.edit().putBoolean("isShow", true).apply()
    }

    fun isBoardShow(): Boolean {
        return preferences.getBoolean("isShow", false)
    }
}