package com.kampus.diagnosa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;

import com.kampus.diagnosa.R;

public class ChooseActivity extends AppCompatActivity {
    
    View admin, user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        
        admin   = findViewById(R.id.layout_admin);
        user    = findViewById(R.id.layout_user);
        
        setEvent();
    }

    private void setEvent() {
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseActivity.this, LoginAdminActivity.class));
                finish();
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseActivity.this, LoginUserActivity.class));
                finish();
            }
        });
    }
}