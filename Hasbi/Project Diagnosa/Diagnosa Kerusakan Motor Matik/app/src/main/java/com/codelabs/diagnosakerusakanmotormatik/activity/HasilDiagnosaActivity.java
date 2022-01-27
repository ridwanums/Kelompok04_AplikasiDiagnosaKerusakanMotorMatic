package com.codelabs.diagnosakerusakanmotormatik.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.codelabs.diagnosakerusakanmotormatik.R;

import static java.lang.Integer.parseInt;

public class HasilDiagnosaActivity extends AppCompatActivity {

    TextView n1, n2, n3, n4, n5, n6, hasil, text_hasil, nama;
    Button simpan;
    DataHelper dbHelper;

    public static String Vbelt, Kopling, Injektor, Busi, Accu, Dinamo;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_diagnosa);

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

        Vbelt = ""+DiagnosaActivity.Vbelt+"%";
        Kopling = ""+DiagnosaActivity.Kopling+"%";
        Injektor = ""+DiagnosaActivity.Injektor+"%";
        Busi = ""+DiagnosaActivity.Busi+"%";
        Accu = ""+DiagnosaActivity.Accu+"%";
        Dinamo = ""+DiagnosaActivity.Dinamo+"%";

        n1.setText(Vbelt);
        n2.setText(Kopling);
        n3.setText(Injektor);
        n4.setText(Busi);
        n5.setText(Accu);
        n6.setText(Dinamo);

        int A = parseInt(DiagnosaActivity.Vbelt);
        int B = parseInt(DiagnosaActivity.Kopling);
        int C = parseInt(DiagnosaActivity.Injektor);
        int D = parseInt(DiagnosaActivity.Busi);
        int E = parseInt(DiagnosaActivity.Accu);
        int F = parseInt(DiagnosaActivity.Dinamo);




        if(A >= B){
            if(A >= C){
                if(A >= D){
                    if(A >= E){
                        if(A >= F) {
                            nama.setText("Vbelt");
                            hasil.setText(""+DiagnosaActivity.Vbelt+"%");
                            text_hasil.setText("MENURUT DIAGNOSA SISTEM MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT");
                        }
                    }
                }
            }
        }

        if(B >= A){
            if(B >= C){
                if(B >= D){
                    if(B >= E){
                        if(B >= F) {
                            nama.setText("Kopling Sentrifugal");
                            hasil.setText(""+DiagnosaActivity.Kopling+"%");
                            text_hasil.setText("MENURUT DIAGNOSA SISTEM MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA KOPLING SENTRIFUGAL");
                        }
                    }
                }
            }
        }

        if(C >= A){
            if(C > B){
                if(C >= D){
                    if(C >= E){
                        if(C >= F) {
                            nama.setText("Injektor");
                            hasil.setText(""+DiagnosaActivity.Injektor+"%");
                            text_hasil.setText("MENURUT DIAGNOSA SISTEM MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJEKTOR");
                        }
                    }
                }
            }
        }

        if(D >= A){
            if(D > B){
                if(D > C){
                    if(D >= E){
                        if(D >= F) {
                            nama.setText("Busi");
                            hasil.setText(""+DiagnosaActivity.Busi+"%");
                            text_hasil.setText("MENURUT DIAGNOSA SISTEM MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI");
                        }
                    }
                }
            }
        }

        if(E >= A){
            if(E > B){
                if(E > C){
                    if(E > D){
                        if(E >= F) {
                            nama.setText("Accu");
                            hasil.setText(""+DiagnosaActivity.Accu+"%");
                            text_hasil.setText("MENURUT DIAGNOSA SISTEM MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA ACCU");
                        }
                    }
                }
            }
        }

        if(F >= A){
            if(F > B){
                if(F > C){
                    if(F > D){
                        if(F > E) {
                            nama.setText("Dinamo Starter");
                            hasil.setText(""+DiagnosaActivity.Dinamo+"%");
                            text_hasil.setText("MENURUT DIAGNOSA SISTEM MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA DINAMO TARTER");
                        }
                    }
                }
            }
        }


        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("INSERT INTO tiga(nama, nilai, hasil, Vbelt, Kopling, Injektor, Busi, Accu, Dinamo) values('" +
                        nama.getText().toString()+"','" +
                        hasil.getText().toString()+"','" +
                        text_hasil.getText().toString()+"','" +
                        n1.getText().toString()+"','" +
                        n2.getText().toString()+"','" +
                        n3.getText().toString()+"','" +
                        n4.getText().toString()+"','" +
                        n5.getText().toString()+"','" +
                        n6.getText().toString()+"')");

                startActivity(new Intent(getApplicationContext(), RiwayatActivity.class));
                Toast.makeText(getApplicationContext(), "Data Berhasil Tersimpan", Toast.LENGTH_LONG).show();
            }
        });
    }
}