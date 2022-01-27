package com.kampus.diagnosa.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.kampus.diagnosa.R;
import com.kampus.diagnosa.fragment.ListFragment;
import com.kampus.diagnosa.fragment.PandaunFragment;

public class HomeAdminActivity extends AppCompatActivity {

    View panduan, list;
    ImageView img_panduan, img_list;
    TextView text_panduan, text_list;
    long exitTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);

        panduan         = findViewById(R.id.btn_panduan);
        list            = findViewById(R.id.btn_list);
        img_panduan     = findViewById(R.id.image_panduan);
        img_list        = findViewById(R.id.image_list);
        text_panduan    = findViewById(R.id.text_panduan);
        text_list    = findViewById(R.id.text_list);

        img_panduan.setImageDrawable(getResources().getDrawable(R.drawable.ic_panduan_red));
        text_panduan.setTextColor(getResources().getColor(R.color.red));
        setFragment(new PandaunFragment());
        setEvent();
    }

    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.transition, fragment);
        fragmentTransaction.commit();
    }

    private void setEvent() {
        panduan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new PandaunFragment());
                img_panduan.setImageDrawable(getResources().getDrawable(R.drawable.ic_panduan_red));
                img_list.setImageDrawable(getResources().getDrawable(R.drawable.ic_person_white));

                text_list.setTextColor(getResources().getColor(R.color.white));
                text_panduan.setTextColor(getResources().getColor(R.color.red));
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new ListFragment());
                img_panduan.setImageDrawable(getResources().getDrawable(R.drawable.ic_panduan_white));
                img_list.setImageDrawable(getResources().getDrawable(R.drawable.ic_person_red));

                text_list.setTextColor(getResources().getColor(R.color.red));
                text_panduan.setTextColor(getResources().getColor(R.color.white));
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - exitTime > 2000) {
            Toast.makeText(this, "Press again to logout", Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            startActivity(new Intent(getApplicationContext(), ChooseActivity.class));
            finish();
        }
    }
}