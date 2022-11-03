package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private TextView tvregister, tvtologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tvregister = findViewById(R.id.tvRegister);
        tvtologin = findViewById(R.id.tvToLogin);

        tvregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(register);
            }
        });

        tvtologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tologin = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(tologin);
            }
        });
    }
}