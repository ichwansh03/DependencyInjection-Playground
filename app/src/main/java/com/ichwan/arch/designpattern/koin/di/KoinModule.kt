package com.ichwan.arch.designpattern.koin.di

import com.ichwan.arch.designpattern.koin.data.UserRepository
import com.ichwan.arch.designpattern.koin.data.UserRepositoryImpl
import com.ichwan.arch.designpattern.koin.presenter.UserPresenter
import com.ichwan.arch.designpattern.koin.presenter.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {
//    single<UserRepository> { UserRepositoryImpl() }
//    factory { UserPresenter(get()) }
//    viewModel { UserViewModel(get()) }

    singleOf(::UserRepositoryImpl) { bind<UserRepository>() }
    factoryOf(::UserPresenter)
    viewModelOf(::UserViewModel)
}