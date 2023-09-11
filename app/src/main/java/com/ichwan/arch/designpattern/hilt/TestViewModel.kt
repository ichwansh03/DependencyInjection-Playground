package com.ichwan.arch.designpattern.hilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("string2") txtString: String
): ViewModel() {
    init {
        Log.d("ViewModel", "test string from ViewModel $txtString ")
    }
}