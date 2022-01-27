package com.codelabs.diagnosakerusakanmotormatik.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.codelabs.diagnosakerusakanmotormatik.R;
import com.codelabs.diagnosakerusakanmotormatik.fragment.BantuanFragment;
import com.codelabs.diagnosakerusakanmotormatik.fragment.BerandaFragment;
import com.codelabs.diagnosakerusakanmotormatik.fragment.TentangFragment;

public class HomeActivity extends AppCompatActivity {

    View beranda, bantuan, tentang;
    ImageView imgBeranda, imgBantuan, imgTentang;
    TextView textBeranda, textBantuan, textTentang;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        beranda            = findViewById(R.id.btn_beranda);
        bantuan            = findViewById(R.id.btn_bantuan);
        tentang            = findViewById(R.id.btn_tentang);
        imgBeranda         = findViewById(R.id.image_beranda);
        imgBantuan         = findViewById(R.id.image_bantuan);
        imgTentang         = findViewById(R.id.image_tentang);
        textBeranda        = findViewById(R.id.text_beranda);
        textBantuan        = findViewById(R.id.text_bantuan);
        textTentang        = findViewById(R.id.text_tentang);

        imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.ic_bernanda_checked));
        textBeranda.setTextColor(getResources().getColor(R.color.orange));
        setFragment(new BerandaFragment());
        setEventFragment();

    }

    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.transition, fragment);
        fragmentTransaction.commit();
    }

    private void setEventFragment() {
        beranda.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new BerandaFragment());
                imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.ic_bernanda_checked));
                imgBantuan.setImageDrawable(getResources().getDrawable(R.drawable.ic_bantuan));
                imgTentang.setImageDrawable(getResources().getDrawable(R.drawable.ic_tentang));


                textBeranda.setTextColor(getResources().getColor(R.color.orange));
                textBantuan.setTextColor(getResources().getColor(R.color.black));
                textTentang.setTextColor(getResources().getColor(R.color.black));
            }
        });

        bantuan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new BantuanFragment());
                imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.ic_beranda));
                imgBantuan.setImageDrawable(getResources().getDrawable(R.drawable.ic_bantuan_checked));
                imgTentang.setImageDrawable(getResources().getDrawable(R.drawable.ic_tentang));


                textBeranda.setTextColor(getResources().getColor(R.color.black));
                textBantuan.setTextColor(getResources().getColor(R.color.orange));
                textTentang.setTextColor(getResources().getColor(R.color.black));
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new TentangFragment());
                imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.ic_beranda));
                imgBantuan.setImageDrawable(getResources().getDrawable(R.drawable.ic_bantuan));
                imgTentang.setImageDrawable(getResources().getDrawable(R.drawable.ic_tentang_checked));


                textBeranda.setTextColor(getResources().getColor(R.color.black));
                textBantuan.setTextColor(getResources().getColor(R.color.black));
                textTentang.setTextColor(getResources().getColor(R.color.orange));
            }
        });
    }
}