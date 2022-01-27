package com.kampus.diagnosa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.kampus.diagnosa.R;
import com.kampus.diagnosa.fragment.PandaunFragment;

import org.w3c.dom.Text;

public class EditActivity extends AppCompatActivity {

    TextView text;
    Button save, cancel;


    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        text     = findViewById(R.id.text_edit);
        save        = findViewById(R.id.btn_save);
        cancel      = findViewById(R.id.btn_cancel);

        preferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        String guide = preferences.getString("guide", "");
        text.setText(guide);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getKonten = text.getText().toString();
                editor = preferences.edit();
                editor.putString("guide", getKonten);
                editor.apply();

                Toast.makeText(getApplicationContext(), "Panduan berhasil disimpan", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), HomeAdminActivity.class));
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}