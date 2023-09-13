package com.ichwan.arch.designpattern.koin.presenter

import androidx.lifecycle.ViewModel
import com.ichwan.arch.designpattern.koin.data.UserRepository

class UserViewModel(private val repository: UserRepository) : ViewModel() {

    fun sayHello(name: String) : String{
        val findUser = repository.findUser(name)
        return findUser?.let { "Hello $it from $this" } ?: "User $name not found!"
    }
}