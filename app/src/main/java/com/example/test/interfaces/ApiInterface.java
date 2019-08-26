package com.example.test.interfaces;

import com.example.test.model.LoginModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("LoginUser")
    Call<LoginModel> setLoginData(@Field("login")String login, @Field("password") String password);
}
