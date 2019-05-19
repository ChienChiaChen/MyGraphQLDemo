package com.jason.myqraphqldemo.util

import com.jason.myqraphqldemo.BuildConfig
import com.jason.myqraphqldemo.model.Query
import com.jason.myqraphqldemo.model.Result
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface ApiInterface {

    @Headers("Authorization:Bearer " + BuildConfig.AUTH_TOKEN)
    @POST("graphql")
    fun getInfo(@Body jsonQuery: Query): Observable<Result>

    companion object Factory {
        fun create(): ApiInterface =
            Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(ApiInterface::class.java)
    }
}