package com.ichwan.diplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity(
    @Inject var engine: Engine,
    @Inject var text1: String,
    @Inject var text2: String
) : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.start()

        engine.startEngine()

        println(text1)
        println(text2)
    }
}