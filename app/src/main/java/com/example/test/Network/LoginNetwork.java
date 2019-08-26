package com.example.test.Network;

import com.example.test.interfaces.ApiInterface;
import com.example.test.interfaces.LoginInterface;
import com.example.test.interfaces.MyCallback;
import com.example.test.model.LoginModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginNetwork implements LoginInterface.Model {
    @Override
    public void getLoginData(String login, String password, final MyCallback<LoginModel> myCallbackLogin) {
        ApiInterface apiInterface = ApiNetwork.getRetrofitInstance().create(ApiInterface.class);
        apiInterface.setLoginData(login, password).enqueue(new Callback<LoginModel>() {
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                myCallbackLogin.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                myCallbackLogin.onFailure(t);
            }
        });
    }
}
