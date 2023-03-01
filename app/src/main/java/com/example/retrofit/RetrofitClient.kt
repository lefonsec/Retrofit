package com.example.retrofit

import com.example.retrofit.service.PostService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {

        private lateinit var INSTANCE: Retrofit
        private const val baseUrl = "https://jsonplaceholder.typicode.com/"
        private fun getRetrofitInstance(): Retrofit {
            val http = OkHttpClient.Builder()
            if (!::INSTANCE.isInitialized) {

                INSTANCE = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(http.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return INSTANCE
        }
        fun createPostService(): PostService {
            return getRetrofitInstance().create(PostService::class.java)
        }
    }
}