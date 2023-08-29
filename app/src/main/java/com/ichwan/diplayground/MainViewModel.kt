package com.ichwan.diplayground

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val engine: Engine
): ViewModel() {
    fun start(){
        engine.startEngine()
    }
}