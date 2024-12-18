package com.example.lunchtray

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lunchtray.ui.theme.LunchTrayTheme

class ActivityPrincipal : ComponentActivity() {
    override fun alCrear(savedInstanceState: Bundle?) {
        super.alCrear(savedInstanceState)
        setContent {
            LunchTrayTheme {
                LunchTrayApp()
            }
        }
    }
}
