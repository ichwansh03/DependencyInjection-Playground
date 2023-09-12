package com.ichwan.arch.designpattern.koin.presenter

import com.ichwan.arch.designpattern.koin.data.UserRepository

class UserPresenter(private val repository: UserRepository) {

    fun sayHello(name: String) : String{
        val findUser = repository.findUser(name)
        return findUser?.let { "Hello $it from $this" } ?: "User $name not found!"
    }
}