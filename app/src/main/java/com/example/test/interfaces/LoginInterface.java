package com.example.test.interfaces;

import com.example.test.model.LoginModel;

import java.util.List;

public interface LoginInterface {
    interface Model {
        void getLoginData(String login, String password, MyCallback<LoginModel> myCallbackLogin);


    }
    interface presenter {
        void onDestroy();             //when the view is destroyed

        void requestDataFromServer(String login, String password); //requesting the data from the server


    }

    interface MainView {

        void setLoginData(LoginModel loginData);
        void onResponseFailure(Throwable throwable);



}
}
