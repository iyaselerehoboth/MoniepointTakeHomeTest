package com.iyaselerehoboth.moniepointtakehometest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.iyaselerehoboth.moniepointtakehometest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNav: BottomNavigationView = binding.bottomNavView
        setupWithNavController(bottomNav, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp() || super.onSupportNavigateUp()
    }
}