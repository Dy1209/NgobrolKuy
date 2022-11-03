package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Setting extends AppCompatActivity {

    private TextView UbahDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        UbahDisplay = findViewById(R.id.tvUbahDisplay);

        UbahDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ubah = new Intent(Setting.this, ProfilePicActivity.class);
                startActivity(ubah);
            }
        });
    }
}