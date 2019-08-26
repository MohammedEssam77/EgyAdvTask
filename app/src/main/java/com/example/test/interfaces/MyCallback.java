package com.example.test.interfaces;

import com.example.test.model.LoginModel;

public interface MyCallback<T> {
    void onSuccess(T response);

    void onFailure(Throwable t);
}
