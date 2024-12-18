package com.example.dessertclicker.data

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

data class PostreUiState(
    val currentPostreIndex: Int = 0,
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    val currentPostrePrice: Int = dessertList[currentPostreIndex].price,
    @DrawableRes val currentPostreImageId: Int = dessertList[currentPostreIndex].imageId
)