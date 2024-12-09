package com.example.kinopoiskcinemaapp.di

import android.content.Context
import androidx.room.Room
import com.example.kinopoiskcinemaapp.data.room.AppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDataBase = Room.databaseBuilder(
        context,
        AppDataBase::class.java,
        "db"
    ).build()

    @Provides
    @Singleton
    fun provideReportDao(db: AppDataBase) = db.filmsDao()

}