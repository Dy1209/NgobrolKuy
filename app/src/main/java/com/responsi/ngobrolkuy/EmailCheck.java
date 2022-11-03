package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EmailCheck extends AppCompatActivity {

    private TextView tvemailsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_check);
        tvemailsubmit = findViewById(R.id.tvEmailSubmit);

        tvemailsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailcek = new Intent(EmailCheck.this, LoginActivity.class);
                startActivity(emailcek);
            }
        });
    }
}