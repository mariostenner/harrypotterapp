package com.mariods.harrypotterapp.di

import com.mariods.harrypotterapp.data.network.HarryPotterApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    private const val BASE_URL = "https://api.potterdb.com/"

    @Provides
    @Singleton
    fun provideRetrofit(): HarryPotterApiClient {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(HarryPotterApiClient::class.java)
    }

    /*@Provides
    @Singleton
    fun providesBooksApiClient(retrofit: Retrofit): HarryPotterApiClient {
        return retrofit.create(HarryPotterApiClient::class.java)
    }
     */
}