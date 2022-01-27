package com.kampus.diagnosa.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kampus.diagnosa.R;
import com.kampus.diagnosa.fragment.MenuFragment;
import com.kampus.diagnosa.fragment.TentangFragment;

public class HomeUserActivity extends AppCompatActivity {

    View menu, tentang;
    ImageView img_menu, img_tentang;
    TextView textMenu, textTentang;
    long exitTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_user);

        menu        = findViewById(R.id.layout_menu);
        tentang     = findViewById(R.id.layout_tentang);
        img_menu    = findViewById(R.id.img_menu);
        img_tentang = findViewById(R.id.img_tentang);
        textMenu    = findViewById(R.id.text_menu);
        textTentang = findViewById(R.id.text_tentang);

        img_menu.setImageDrawable(getResources().getDrawable(R.drawable.ic_menu_blue));
        textMenu.setTextColor(getResources().getColor(R.color.blue));
        setFragment(new MenuFragment());
        setEvent();


    }

    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.transition, fragment);
        fragmentTransaction.commit();
    }

    private void setEvent() {
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment(new MenuFragment());
                img_menu.setImageDrawable(getResources().getDrawable(R.drawable.ic_menu_blue));
                textMenu.setTextColor(getResources().getColor(R.color.blue));

                img_tentang.setImageDrawable(getResources().getDrawable(R.drawable.ic_panduan_user_red));
                textTentang.setTextColor(getResources().getColor(R.color.red));
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment(new TentangFragment());
                img_menu.setImageDrawable(getResources().getDrawable(R.drawable.ic_menu_red));
                textMenu.setTextColor(getResources().getColor(R.color.red));

                img_tentang.setImageDrawable(getResources().getDrawable(R.drawable.ic_panduan_user_blue));
                textTentang.setTextColor(getResources().getColor(R.color.blue));
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - exitTime > 2000) {
            Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            startActivity(new Intent(getApplicationContext(), ChooseActivity.class));
            finish();
        }
    }
}