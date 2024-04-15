package com.example.example.handlers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.example.views.DataView
import com.example.example.views.ListView

@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListView") {

        composable(route = "ListView") {
            ListView(navController)
        }

        composable(route = "DataView/{img}/{trabajo}", arguments = listOf(
            navArgument("img") {type = NavType.IntType},
            navArgument("trabajo") {type = NavType.StringType}
        )) {
            parameters ->
                val img = parameters.arguments?.getInt("img") ?: 0
                val trabajo = parameters.arguments?.getString("trabajo") ?: ""

            DataView(navController, img, trabajo)
        }

    }
}