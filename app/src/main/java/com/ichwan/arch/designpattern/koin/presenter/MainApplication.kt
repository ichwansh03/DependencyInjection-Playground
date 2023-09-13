package com.ichwan.arch.designpattern.koin.presenter

import android.app.Application
import com.ichwan.arch.designpattern.koin.data.DefaultData
import com.ichwan.arch.designpattern.koin.data.UserRepository
import com.ichwan.arch.designpattern.koin.di.appModule
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {

    private val userRepository : UserRepository by inject()

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(appModule)
        }

        userRepository.addUser(DefaultData.DEFAULT_USERS)
    }

}