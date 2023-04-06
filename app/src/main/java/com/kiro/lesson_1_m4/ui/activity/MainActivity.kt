package com.kiro.lesson_1_m4.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kiro.lesson_1_m4.R
import com.kiro.lesson_1_m4.databinding.ActivityMainBinding

class MainActivity(private var binding: ActivityMainBinding) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}