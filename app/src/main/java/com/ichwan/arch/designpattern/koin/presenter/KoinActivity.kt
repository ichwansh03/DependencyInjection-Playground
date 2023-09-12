package com.ichwan.arch.designpattern.koin.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ichwan.arch.designpattern.R
import com.ichwan.arch.designpattern.databinding.ActivityKoinBinding
import org.koin.android.ext.android.inject

class KoinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKoinBinding
    private val presenter: UserPresenter by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKoinBinding.inflate(layoutInflater)



        setContentView(binding.root)
    }
}