package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.data.PostreUiState
import com.example.dessertclicker.data.Datasource.dessertList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class PostreViewModel : ViewModel() {

    private val _dessertUiState = MutableStateFlow(PostreUiState())
    val dessertUiState: StateFlow<PostreUiState> = _dessertUiState.asStateFlow()

    fun onPostreClicked() {
       _dessertUiState.update { cupcakeUiState ->
           val dessertsSold = cupcakeUiState.dessertsSold + 1
           val nextPostreIndex = determinePostreIndex(dessertsSold)
           cupcakeUiState.copy(
               currentPostreIndex = nextPostreIndex,
               revenue = cupcakeUiState.revenue + cupcakeUiState.currentPostrePrice,
               dessertsSold = dessertsSold,
               currentPostreImageId = dessertList[nextPostreIndex].imageId,
               currentPostrePrice = dessertList[nextPostreIndex].price
           )
       }
    }

    private fun determinePostreIndex(dessertsSold: Int): Int {
        var dessertIndex = 0
        for (index in dessertList.indices) {
            if (dessertsSold >= dessertList[index].startProductionAmount) {
                dessertIndex = index
            } else {
                break
            }
        }
        return dessertIndex
    }
}