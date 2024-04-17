package com.example.example.handlers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.example.views.AlumnView
import com.example.example.views.ListView

@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListView") {

        //Definiendo Rutas
        composable(route = "ListView") {
            ListView(navController)
        }

        composable(route = "AlumnView" +
                "/{mensaje}" +
                "/{id}" +
                "/{nombre}" +
                "/{correo}" +
                "/{semestre}" +
                "/{carrera}" +
                "/{becado}" +
                "/{promedio}" +
                "/{boletos}" +
                "/{img}",

            arguments =
            listOf(
                navArgument("mensaje") {type = NavType.StringType},
                navArgument("id") {type = NavType.IntType},
                navArgument("nombre") {type = NavType.StringType},
                navArgument("correo") {type = NavType.StringType},
                navArgument("semestre") {type = NavType.IntType},
                navArgument("carrera") {type = NavType.StringType},
                navArgument("becado") {type = NavType.BoolType},
                navArgument("promedio") {type = NavType.FloatType},
                navArgument("boletos") {type = NavType.IntType},
                navArgument("img") {type = NavType.IntType}
            )
        ) {
                parameters ->
            val mensaje = parameters.arguments?.getString("message") ?: ""
            val id = parameters.arguments?.getInt("id") ?: 0
            val nombre = parameters.arguments?.getString("nombre") ?: ""
            val correo = parameters.arguments?.getString("correo") ?: ""
            val semestre = parameters.arguments?.getInt("semestre") ?: 0
            val carrera = parameters.arguments?.getString("carrera") ?: ""
            val becado = parameters.arguments?.getBoolean("becado") ?: false
            val promedio = parameters.arguments?.getInt("promedio") ?: 0
            val boletos = parameters.arguments?.getInt("soldTickets") ?: 0
            val img = parameters.arguments?.getInt("img") ?: 0

            AlumnView(
                navController,
                mensaje,
                id,
                nombre,
                correo,
                semestre,
                carrera,
                becado,
                promedio,
                boletos,
                img
            )
        }
    }
}