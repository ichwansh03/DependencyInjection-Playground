package com.ichwan.diplayground

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * class ini harus ada setiap mengimplementasikan DI
 */
@HiltAndroidApp
class BaseApplication : Application() {


}