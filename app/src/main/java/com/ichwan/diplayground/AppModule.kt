package com.ichwan.diplayground

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideEngine(
        @ApplicationContext context: Context,
        @Named("owner") owner: String
    ): Engine{
        return Engine(context, owner)
    }

    @Singleton
    @Provides
    @Named("owner")
    fun provideOwner() = "Ichwan Sholihin"

    @Singleton
    @Provides
    fun provideString() = "this is string will be injected"
}