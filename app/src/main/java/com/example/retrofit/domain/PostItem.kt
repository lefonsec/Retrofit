package com.example.retrofit.domain

import com.google.gson.annotations.SerializedName

data class PostItem(

    @SerializedName("body")
    var body: String,

    @SerializedName("id")
    var id: Int,

    @SerializedName("title")
    var title: String,

    @SerializedName("userId")
    var userId: Int
)