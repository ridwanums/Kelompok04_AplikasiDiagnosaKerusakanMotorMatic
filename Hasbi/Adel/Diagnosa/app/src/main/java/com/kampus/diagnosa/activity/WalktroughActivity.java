package com.kampus.diagnosa.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kampus.diagnosa.R;
import com.kampus.diagnosa.adapter.WalktroughAdapter;
import com.kampus.diagnosa.model.WalktroughItem;

import java.util.ArrayList;
import java.util.List;

public class WalktroughActivity extends AppCompatActivity {

    ViewPager viewPager;
    TextView next, conti, lewati;
    ImageView img1, img2, img3;
    WalktroughAdapter adapter;
    int page = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walktrough);

        viewPager       = findViewById(R.id.viewPager);
        next            = findViewById(R.id.text_next);
        conti           = findViewById(R.id.text_continue);
        lewati          = findViewById(R.id.text_lewati);
        img1            = findViewById(R.id.image_next1);
        img2            = findViewById(R.id.image_next2);
        img3            = findViewById(R.id.image_next3);

        conti.setVisibility(View.GONE);
        img1.setVisibility(View.VISIBLE);
        img2.setVisibility(View.GONE);
        img3.setVisibility(View.GONE);
        next.setVisibility(View.VISIBLE);

        setPage();
        setView();
        setEvent();
    }

    private void setPage() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                page = position;
                switch (position) {
                    case 0 :
                        next.setVisibility(View.VISIBLE);
                        conti.setVisibility(View.GONE);
                        img1.setVisibility(View.VISIBLE);
                        img2.setVisibility(View.GONE);
                        img3.setVisibility(View.GONE);
                        break;

                    case 1 :
                        next.setVisibility(View.VISIBLE);
                        conti.setVisibility(View.GONE);
                        img1.setVisibility(View.GONE);
                        img2.setVisibility(View.VISIBLE);
                        img3.setVisibility(View.GONE);
                        break;

                    case 2 :
                        next.setVisibility(View.GONE);
                        conti.setVisibility(View.VISIBLE);
                        img1.setVisibility(View.GONE);
                        img2.setVisibility(View.GONE);
                        img3.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setView() {
        List<WalktroughItem> walktroughItems = new ArrayList<>();
        walktroughItems.add(new WalktroughItem("DIAGNOSA", "Mempermudah mengetahui keruskan pada motor matic yamaha", R.drawable.slide1));
        walktroughItems.add(new WalktroughItem("FORWARD CHAINING", "Teknik Pemecahan masalah dengan mencari fakta yang diketaui", R.drawable.slide2));
        walktroughItems.add(new WalktroughItem("TEOREMA BAYES", "Teknik Pemecahan masalah dengan menghitung besarnya peluang", R.drawable.slide3));
        adapter = new WalktroughAdapter(this, walktroughItems);
        viewPager.setAdapter(adapter);
    }

    private void setEvent() {
        conti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WalktroughActivity.this, ChooseActivity.class));
                finish();
            }
        });

        lewati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WalktroughActivity.this, ChooseActivity.class));
                finish();
            }
        });
    }

    public void next(View view){
        viewPager.setCurrentItem(viewPager.getCurrentItem()+1, true);
    }
}