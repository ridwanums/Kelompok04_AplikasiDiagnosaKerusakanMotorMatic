package com.kampus.diagnosa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kampus.diagnosa.R;

public class LoginUserActivity extends AppCompatActivity {

    String usernama = "user@gmail.com";
    String pass     = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        Button login       = findViewById(R.id.btn_login);
        EditText email       = findViewById(R.id.text_email);
        EditText password    = findViewById(R.id.text_password);

        email.setText("user@gmail.com");
        password.setText("123456");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equalsIgnoreCase(usernama) && password.getText().toString().equalsIgnoreCase(pass)){
                    startActivity(new Intent(getApplicationContext(), HomeUserActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(), "email/password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), ChooseActivity.class));
        finish();
    }
}