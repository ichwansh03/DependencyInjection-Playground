package com.ichwan.arch.designpattern.koin.di

import com.ichwan.arch.designpattern.koin.data.UserRepository
import com.ichwan.arch.designpattern.koin.data.UserRepositoryImpl
import com.ichwan.arch.designpattern.koin.presenter.UserPresenter
import org.koin.dsl.module

val appModule = module {
    single<UserRepository> { UserRepositoryImpl() }
    factory { UserPresenter(get()) }

}