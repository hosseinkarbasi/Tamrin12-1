package com.example.netflix.Network

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface GitHubService {

    @Multipart
    @POST("users/{userName}")
    fun uploadImage(
        @Path("userName") userName: String,
        @Part image: MultipartBody.Part
    ): Call<Any>

}