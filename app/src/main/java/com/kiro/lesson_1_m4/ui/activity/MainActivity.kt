package com.kiro.lesson_1_m4.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.kiro.lesson_1_m4.R
import com.kiro.lesson_1_m4.databinding.ActivityMainBinding
import com.kiro.lesson_1_m4.ui.utils.App

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        controller = navHostFragment.navController

        if(!App.prefs.isBoardShow()) {
            controller.navigate(R.id.onBoardFragment)
        }
    }
}