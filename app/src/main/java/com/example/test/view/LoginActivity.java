package com.example.test.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.test.Network.LoginNetwork;
import com.example.test.R;
import com.example.test.interfaces.LoginInterface;
import com.example.test.model.LoginModel;
import com.example.test.presenter.LoginPresenter;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements LoginInterface.MainView {
    EditText emailTxt;
    EditText passwordTxt;
    Button btn_log;
    private LoginInterface.presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailTxt = findViewById(R.id.emailTxt);
        passwordTxt = findViewById(R.id.passwordTxt);
        btn_log = findViewById(R.id.btn_log);

        presenter = new LoginPresenter(this, new LoginNetwork());

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.requestDataFromServer(emailTxt.getText().toString(), passwordTxt.getText().toString());
            }
        });
    }

    @Override
    public void setLoginData(LoginModel loginData) {
        Toast.makeText(this, loginData.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResponseFailure(Throwable throwable) {
        Toast.makeText(this, "خطأ فى تسجيل الدخول", Toast.LENGTH_SHORT).show();
    }
}
