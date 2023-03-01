package com.example.retrofit.service

import com.example.retrofit.domain.PostItem
import retrofit2.Call
import retrofit2.http.GET

interface PostService {

    @GET("posts")
    fun list(): Call<List<PostItem>>
}