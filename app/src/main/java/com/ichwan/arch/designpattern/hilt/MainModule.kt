package com.ichwan.arch.designpattern.hilt

import android.content.Context
import com.ichwan.arch.designpattern.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityRetainedComponent::class)
object MainModule {

    @ActivityRetainedScoped
    @Provides
    @Named("string2")
    fun provideString2(
        @ApplicationContext context: Context,
        @Named("string1") textString1: String
    ) = "${context.getString(R.string.string_inject)} to $textString1"
}