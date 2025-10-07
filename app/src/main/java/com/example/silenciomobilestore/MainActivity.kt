package com.example.silenciomobilestore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.silenciomobilestore.ui.AppScreen
import com.example.silenciomobilestore.ui.components.*
import com.example.silenciomobilestore.ui.theme.SilencioMobileStoreTheme
import com.example.silenciomobilestore.ui.components.PhoneComparisonScreen
import com.example.silenciomobilestore.ui.components.PhoneListScreen
import com.example.silenciomobilestore.ui.components.PhoneDetailsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SilencioMobileStoreTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var currentScreen by remember { mutableStateOf(AppScreen.MAIN_MENU) }

                    when (currentScreen) {
                        AppScreen.MAIN_MENU -> MainMenuScreen(
                            onNavigate = { screen: AppScreen -> currentScreen = screen }
                        )

                        AppScreen.PHONE_COMPARISON -> PhoneComparisonScreen(
                            onBackClick = { currentScreen = AppScreen.MAIN_MENU }
                        )

                        AppScreen.PHONE_LIST -> PhoneListScreen(
                            onBackClick = { currentScreen = AppScreen.MAIN_MENU }
                        )

                        AppScreen.PHONE_DETAILS -> PhoneDetailsScreen(
                            onBackClick = { currentScreen = AppScreen.MAIN_MENU }
                        )
                    }
                }
            }
        }
    }
}