package com.example.test.view;

import android.content.Intent;
import android.os.Bundle;

import com.example.test.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(4000);
                    Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(intent);
                    finish();

                }catch (InterruptedException e){
                    e.printStackTrace();

                }

            }
        };
        thread.start();
    }
}

