package com.codelabs.diagnosakerusakanmotormatik.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.codelabs.diagnosakerusakanmotormatik.R;

public class ViewRiwayatActivity extends AppCompatActivity {

    TextView n1, n2, n3, n4, n5, n6, hasil, text_hasil, nama;
    protected Cursor cursor;
    Button simpan;
    DataHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_riwayat);
        dbHelper = new DataHelper(this);

        n1 = findViewById(R.id.nilai1);
        n2 = findViewById(R.id.nilai2);
        n3 = findViewById(R.id.nilai3);
        n4 = findViewById(R.id.nilai4);
        n5 = findViewById(R.id.nilai5);
        n6 = findViewById(R.id.nilai6);
        hasil = findViewById(R.id.nilai);
        text_hasil = findViewById(R.id.hasil);
        nama    = findViewById(R.id.nama);
        simpan = findViewById(R.id.simpan);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM tiga WHERE nama =	'" + getIntent().getStringExtra("nama") + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            nama.setText(cursor.getString(1).toString());
            hasil.setText(cursor.getString(2).toString());
            text_hasil.setText(cursor.getString(3).toString());
            n1.setText(cursor.getString(4).toString());
            n2.setText(cursor.getString(5).toString());
            n3.setText(cursor.getString(6).toString());
            n4.setText(cursor.getString(7).toString());
            n5.setText(cursor.getString(8).toString());
            n6.setText(cursor.getString(9).toString());


        }
    }
}