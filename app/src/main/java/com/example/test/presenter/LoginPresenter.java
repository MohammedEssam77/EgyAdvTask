package com.example.test.presenter;

import com.example.test.interfaces.LoginInterface;
import com.example.test.interfaces.MyCallback;
import com.example.test.model.LoginModel;

public class LoginPresenter implements LoginInterface.presenter {
    private LoginInterface.MainView view;
    private LoginInterface.Model model;

    public LoginPresenter(LoginInterface.MainView view, LoginInterface.Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void requestDataFromServer(String login, String password) {
        model.getLoginData(login, password, new MyCallback<LoginModel>() {

            @Override
            public void onSuccess(LoginModel response) {
                view.setLoginData(response);


            }

            @Override
            public void onFailure(Throwable t) {

                if (view != null) {
                    view.onResponseFailure(t);
                }
            }
        });
    }
}
