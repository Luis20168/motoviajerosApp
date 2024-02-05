package com.example.motoviajerosapp.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.motoviajerosapp.R
import com.example.motoviajerosapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUi()




    }

    private fun initUi() {
        initNavigation()
    }

    private fun initNavigation() {
        val navHost= supportFragmentManager.findFragmentById(R.id.FragmentContainerView) as NavHostFragment
        navController= navHost.navController
        binding.bottomMenu.setupWithNavController(navController)

    }
}