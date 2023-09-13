package com.ichwan.arch.designpattern.koin.presenter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ichwan.arch.designpattern.databinding.ActivityKoinBinding
import com.ichwan.arch.designpattern.koin.data.DefaultData
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class KoinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKoinBinding
    private val presenter: UserPresenter by inject()
    private val viewModel: UserViewModel by viewModel()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKoinBinding.inflate(layoutInflater)

        title = "MyKoinActivity"

        val name = DefaultData.DEFAULT_USER.name
        binding.textField.text = "${presenter.sayHello(name)} \n ${viewModel.sayHello(name)}"

        setContentView(binding.root)
    }
}