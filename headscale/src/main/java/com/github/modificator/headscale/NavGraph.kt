@file:OptIn(ExperimentalAnimationApi::class)

package com.github.modificator.headscale

import androidx.compose.animation.*
import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.github.modificator.headscale.ui.NodeList
import com.github.modificator.headscale.ui.Register
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

object Destinations {
    val register = "Register"
    val NodeList = "NodeList"
}

@Composable
fun NavGraph(
    navController: NavHostController = rememberAnimatedNavController()
) {
    AnimatedNavHost(navController, startDestination = Destinations.register) {
        composable(
            Destinations.register,
        ) {
            Register(navController)
        }
        composable(Destinations.NodeList) {
            NodeList(navController)
        }
    }
}