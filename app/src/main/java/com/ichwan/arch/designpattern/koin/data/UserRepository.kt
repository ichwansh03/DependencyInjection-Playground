package com.ichwan.arch.designpattern.koin.data

interface UserRepository {

    fun findUser(name: String): User?
    fun addUser(users: List<User>)
}