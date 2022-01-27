package com.codelabs.diagnosakerusakanmotormatik.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.codelabs.diagnosakerusakanmotormatik.R;

public class DataKerusakanActivity extends AppCompatActivity {

    View vBelt, kopling, injektor, busi, accu, dinamo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kerusakan);

        vBelt       = findViewById(R.id.vBelt);
        kopling     = findViewById(R.id.kopling);
        injektor    = findViewById(R.id.injektor);
        busi        = findViewById(R.id.busi);
        accu        = findViewById(R.id.accu);
        dinamo      = findViewById(R.id.dinamo);

        setEvent();
    }

    private void setEvent() {
        vBelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), VbeltActivityActivity.class));
            }
        });

        kopling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), KoplingAktivityActivity.class));
            }
        });

        injektor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), InjektorActivity.class));
            }
        });

        busi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BusiActivity.class));
            }
        });

        accu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AccuActivity.class));
            }
        });

        dinamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DinamoStarterActivity.class));
            }
        });
    }
}