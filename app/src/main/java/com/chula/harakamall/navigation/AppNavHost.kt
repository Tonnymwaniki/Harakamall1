package com.chula.harakamall.navigation

import android.app.Service
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.chula.harakamall.data.UserDatabase
import com.chula.harakamall.repository.UserRepository
import com.chula.harakamall.ui.screens.about.AboutScreen
import com.chula.harakamall.ui.screens.auth.LoginScreen
import com.chula.harakamall.ui.screens.auth.RegisterScreen
import com.chula.harakamall.ui.screens.commerce.CommerceScreen
import com.chula.harakamall.ui.screens.dashboard.DashboardScreen
import com.chula.harakamall.ui.screens.form.FormScreen
import com.chula.harakamall.ui.screens.grocery.GroceryScreen
import com.chula.harakamall.ui.screens.home.HomeScreen
import com.chula.harakamall.ui.screens.intent.IntentScreen
import com.chula.harakamall.ui.screens.item.ItemScreen
import com.chula.harakamall.ui.screens.products.AddProductScreen
import com.chula.harakamall.ui.screens.products.EditProductScreen
import com.chula.harakamall.ui.screens.products.ProductListScreen
import com.chula.harakamall.ui.screens.service.ServiceScreen
import com.chula.harakamall.ui.screens.splash.SplashScreen
import com.chula.harakamall.ui.screens.start.StartScreen
import com.chula.harakamall.viewmodel.AuthViewModel
import com.chula.harakamall.viewmodel.ProductViewModel

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ADD_PRODUCT ,
    productViewModel: ProductViewModel= viewModel(),

    ) {

    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUT_COMMERCE) {

            CommerceScreen(navController)
        }

        composable(ROUT_FORM) {
            FormScreen(navController)
        }

        composable(ROUT_GROCERY) {
            GroceryScreen(navController)
        }

        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }

        // PRODUCTS
        composable(ROUT_ADD_PRODUCT) {
            AddProductScreen(navController, productViewModel)
        }

        composable(ROUT_PRODUCT_LIST) {
            ProductListScreen(navController, productViewModel)
        }

        composable(
            route = ROUT_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, productViewModel)
            }
        }



    }
}

@Composable
fun SamanthaScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

