package com.example.cupcake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.cupcake.ui.theme.CupcakeTheme

class ActivityPrincipal : ComponentActivity() {
    override fun alCrear(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.alCrear(savedInstanceState)
        setContent {
            CupcakeTheme {
                CupcakeApp()
            }
        }
    }
}
