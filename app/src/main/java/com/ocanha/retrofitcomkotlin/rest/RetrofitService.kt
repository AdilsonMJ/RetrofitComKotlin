package com.ocanha.retrofitcomkotlin.rest

import com.ocanha.retrofitcomkotlin.model.Recipe
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface RetrofitService {

    @GET("recipes")
    fun getAllRecipes() : Call<List<Recipe>>

    companion object{
        private val retrofitService: RetrofitService by lazy {
            val retrofitService = Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            retrofitService.create(RetrofitService::class.java)
        }

        fun getInstance() : RetrofitService = retrofitService

    }

}