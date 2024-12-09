package com.example.kinopoiskcinemaapp.di

import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import com.example.kinopoiskcinemaapp.presentation.home.actorpage.ActorPageViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ViewModelModule {

    @Provides
    @Singleton
    fun provideActorPage(kinopoiskRepo: KinopoiskRepo): ActorPageViewModel =
        ActorPageViewModel(kinopoiskRepo)
}