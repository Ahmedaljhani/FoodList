package com.example.foodlist.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.foodlist.R
import com.example.foodlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    // add name of activity or fragment to action bar
   // private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        navController = navHostFragment.findNavController()

//        //Give the action bar the correct title for the current screen (this uses the fragment label)
//        appBarConfiguration = AppBarConfiguration(
//            setOf(R.id.food_graph, R.id.setting_graph)
//        )
        //    // add name of activity or fragment to action bar
//        //Connects the action bar with the nav controller
//        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.bottomNav.setupWithNavController(navController)
    }

    //gives functionality to the back button on the action bar
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}