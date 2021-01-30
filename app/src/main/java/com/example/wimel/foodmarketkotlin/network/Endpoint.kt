package com.example.wimel.foodmarketkotlin.network

import com.example.wimel.foodmarketkotlin.model.response.Wrapper
import com.example.wimel.foodmarketkotlin.model.response.login.LoginResponse
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.http.*

interface Endpoint {

    @FormUrlEncoded
    @POST("login")
    fun login(@Field("email") email:String,
              @Field("password") password:String) : Observable<Wrapper<LoginResponse>>

    @FormUrlEncoded
    @POST("register")
    fun register(@Field("name") name:String,
                 @Field("email") email:String,
                 @Field("password") password:String,
                 @Field("password_confirmation") password_confirmation:String,
                 @Field("address") address:String,
                 @Field("city") city:String,
                 @Field("houseNumber") houseNumber:String,
                 @Field("phoneNumber") phoneNumber:String) : Observable<Wrapper<LoginResponse>>

    @Multipart
    @POST("user/photo")
    fun registerPhoto(@Part profileImage: MultipartBody.Part) : Observable<Wrapper<Any>>

}