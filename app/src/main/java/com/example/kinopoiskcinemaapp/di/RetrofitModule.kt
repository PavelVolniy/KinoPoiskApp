package com.example.kinopoiskcinemaapp.di

import android.content.Context
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.data.retrofit.KPApi
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    @Singleton
    fun providerApi(@ApplicationContext context: Context): KPApi {
        val client: OkHttpClient.Builder = OkHttpClient.Builder()
        client.addInterceptor(Interceptor { chain ->
            val requestBuilder = chain.request().newBuilder()
            requestBuilder.header("X-API-KEY", context.getString(R.string.ApiKey))
            chain.proceed(requestBuilder.build())
        })

        val retrofit = Retrofit.Builder()
            .baseUrl(context.getString(R.string.BASE_URL))
            .addConverterFactory(GsonConverterFactory.create())
            .client(client.build())
            .build()
        return retrofit.create(KPApi::class.java)
    }


    @Provides
    @Singleton
    fun getKinopoiskRepo(api: KPApi): KinopoiskRepo {
        return KinopoiskRepo(api)
    }
}