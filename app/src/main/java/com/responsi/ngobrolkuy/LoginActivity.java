package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText etusername, etpass;
    private TextView tvlupapass, tvlogin, tvregis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etusername = findViewById(R.id.etUsername);
        etpass = findViewById(R.id.etPassword);
        tvlupapass = findViewById(R.id.tvLupaPass);
        tvlogin = findViewById(R.id.tvLogin);
        tvregis = findViewById(R.id.tvRegis);

        tvregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(regis);
            }
        });

        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(LoginActivity.this, HomeChat.class);
                startActivity(login);
            }
        });

        tvlupapass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forget = new Intent(LoginActivity.this, ForgetPassword.class);
                startActivity(forget);
            }
        });
    }
}