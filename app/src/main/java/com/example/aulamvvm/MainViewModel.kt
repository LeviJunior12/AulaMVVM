package com.example.aulamvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val soma = MutableLiveData<Int>().apply {
        value = 0
    }

    //Método de incremento
    fun incremento(num: Int) {
        soma.value.let {
            soma.value = it?.plus(num)
        }
    }

    fun refresh() {
        soma.value.let {
            soma.value = 0
        }
    }
}