package com.example.kiwoomapitest.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kiwoomapitest.api.initKiwoomApi
import kotlinx.coroutines.launch

class TradeViewModel : ViewModel() {


    fun aaaa(){
        viewModelScope.launch {
            initKiwoomApi()
        }
    }


}