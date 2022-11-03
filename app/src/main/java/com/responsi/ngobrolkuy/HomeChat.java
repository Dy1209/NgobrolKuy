package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomeChat extends AppCompatActivity {

    private ImageView ivSetting;
    private LinearLayout LLFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);

        ivSetting = findViewById(R.id.setting);
        LLFirst = findViewById(R.id.firstchat);

        ivSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent set = new Intent(HomeChat.this, Setting.class);
                startActivity(set);
            }
        });

        LLFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent personal = new Intent(HomeChat.this, PersonalChat.class);
                startActivity(personal);
            }
        });
    }
}