package com.kampus.diagnosa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.kampus.diagnosa.R;

public class DiagnosaActivity extends AppCompatActivity {

    CheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
    TextView hasil;
    Button diagnosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);


        c1          = findViewById(R.id.checkbox_gejala1);
        c2          = findViewById(R.id.checkbox_gejala2);
        c3          = findViewById(R.id.checkbox_gejala3);
        c4          = findViewById(R.id.checkbox_gejala4);
        c5          = findViewById(R.id.checkbox_gejala5);
        c6          = findViewById(R.id.checkbox_gejala6);
        c7          = findViewById(R.id.checkbox_gejala7);
        c8          = findViewById(R.id.checkbox_gejala8);
        c9          = findViewById(R.id.checkbox_gejala9);
        c10         = findViewById(R.id.checkbox_gejala10);
        hasil       = findViewById(R.id.hasil_diagnsoa);
        diagnosa    = findViewById(R.id.btn_diagnosa);

        setEvent();
    }

    private void setEvent() {
        diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checked1();
                checked2();
                checked3();
                checked4();
                checked5();
                checked6();
                checked7();
                checked8();
                checked9();
                checked10();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void checked1() {
        if (c1.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT"
            );
        }

        if (c2.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT"
            );
        }

        if (c3.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
            );
        }

        if (c4.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
            );
        }

        if (c5.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR"
            );
        }

        if (c6.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
            );
        }

        if (c7.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
            );
        }

        if (c8.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA ACCU"
            );
        }

        if (c9.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA ACCU"
            );
        }

        if (c10.isChecked()){
            hasil.setText(
                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA KOMPONEN DINAMO STARTER"
            );
        }
    }

    @SuppressLint("SetTextI18n")
    private void checked2() {

        //================================================== ~1~ =================================================//
        if (c1.isChecked()){
            if (c2.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT"
                );
            }
        }
        if (c1.isChecked()){
            if (c3.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                );
            }
        }
        if (c1.isChecked()){
            if (c4.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                );
            }
        }
        if (c1.isChecked()){
            if (c5.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN INJEKTOR"
                );
            }
        }
        if (c1.isChecked()){
            if (c6.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN BUSI"
                );
            }
        }
        if (c1.isChecked()){
            if (c7.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN BUSI"
                );
            }
        }
        if (c1.isChecked()){
            if (c8.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN ACCU"
                );
            }
        }
        if (c1.isChecked()){
            if (c9.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN ACCU"
                );
            }
        }
        if (c1.isChecked()){
            if (c10.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN KOMPONEN DINAMO STARTER"
                );
            }
        }
        //================================================== ~1~ =================================================//

        //================================================== ~2~ =================================================//
        if (c2.isChecked()){
            if (c3.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                );
            }
        }
        if (c2.isChecked()){
            if (c4.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                );
            }
        }
        if (c2.isChecked()){
            if (c5.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN INJECTOR"
                );
            }
        }
        if (c2.isChecked()){
            if (c6.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN BUSI"
                );
            }
        }
        if (c2.isChecked()){
            if (c7.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN BUSI"
                );
            }
        }
        if (c2.isChecked()){
            if (c8.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN ACCU"
                );
            }
        }
        if (c2.isChecked()){
            if (c9.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN ACCU"
                );
            }
        }
        if (c2.isChecked()){
            if (c10.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT DAN KOMPONEN DINAMO STARTER"
                );
            }
        }
        //================================================== ~2~ =================================================//

        //================================================== ~3~ =================================================//
        if (c3.isChecked()){
            if(c4.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                );
            }
        }
        if (c3.isChecked()){
            if(c5.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN INJEKTOR"
                );
            }
        }
        if (c3.isChecked()){
            if(c6.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN BUSI"
                );
            }
        }
        if (c3.isChecked()){
            if(c7.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN BUSI"
                );
            }
        }
        if (c3.isChecked()){
            if(c8.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN ACCU"
                );
            }
        }
        if (c3.isChecked()){
            if(c9.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN ACCU"
                );
            }
        }
        if (c3.isChecked()){
            if(c10.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN KOMPONEN DINAMO STARTER"
                );
            }
        }
        //================================================== ~3~ =================================================//

        //================================================== ~4~ =================================================//
        if(c4.isChecked()){
            if (c5.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN INJEKTOR"
                );
            }
        }
        if(c4.isChecked()){
            if (c6.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN BUSI"
                );
            }
        }
        if(c4.isChecked()){
            if (c7.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN BUSI"
                );
            }
        }
        if(c4.isChecked()){
            if (c8.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN ACCU"
                );
            }
        }
        if(c4.isChecked()){
            if (c9.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN ACCU"
                );
            }
        }
        if(c4.isChecked()){
            if (c10.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN KOMPONEN DINAMO STARTER"
                );
            }
        }
        //================================================== ~4~ =================================================//

        //================================================== ~5~ =================================================//
        if (c5.isChecked()){
            if (c6.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR DAN BUSI"
                );
            }
        }
        if (c5.isChecked()){
            if (c7.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR DAN BUSI"
                );
            }
        }
        if (c5.isChecked()){
            if (c8.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR DAN ACCU"
                );
            }
        }
        if (c5.isChecked()){
            if (c9.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR DAN ACCU"
                );
            }
        }
        if (c5.isChecked()){
            if (c10.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR DAN KOMPONEN DINAMO STARTER"
                );
            }
        }
        //================================================== ~5~ =================================================//

        //================================================== ~6~ =================================================//
        if(c6.isChecked()){
            if(c7.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                );
            }
        }

        if(c6.isChecked()){
            if(c8.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI DAN ACCU"
                );
            }
        }

        if(c6.isChecked()){
            if(c9.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI DAN ACCU"
                );
            }
        }

        if(c6.isChecked()){
            if(c10.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI DAN KOMPONEN DINAMO STARTER"
                );
            }
        }
        //================================================== ~6~ =================================================//

        //================================================== ~7~ =================================================//
        if (c7.isChecked()){
            if (c8.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI DAN ACCU"
                );
            }
        }
        if (c7.isChecked()){
            if (c8.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI DAN ACCU"
                );
            }
        }
        if (c7.isChecked()){
            if (c8.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI DAN KOMPONEN DINAMO STARTER"
                );
            }
        }
        //================================================== ~7~ =================================================//

        //================================================== ~8~ =================================================//
        if (c8.isChecked()){
            if (c9.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA ACCU"
                );
            }
        }

        if (c8.isChecked()){
            if (c10.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA KOMPONEN DINAMO STARTER "
                );
            }
        }
        //================================================== ~8~ =================================================//

        //================================================== ~9~ =================================================//
        if (c9.isChecked()){
            if (c10.isChecked()){
                hasil.setText(
                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA KOMPONEN DINAMO STARTER "
                );
            }
        }
        //================================================== ~9~ =================================================//
    }

    @SuppressLint("SetTextI18n")
    private void checked3() {
        //================================================== ~1~ =================================================//
        if (c1.isChecked()){
            if (c2.isChecked()){
                if (c3.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c1.isChecked()){
            if (c2.isChecked()){
                if (c4.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c1.isChecked()){
            if (c2.isChecked()){
                if (c5.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT"
                    );
                }
            }
        }
        if (c1.isChecked()){
            if (c2.isChecked()){
                if (c6.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT"
                    );
                }
            }
        }
        if (c1.isChecked()){
            if (c2.isChecked()){
                if (c7.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT"
                    );
                }
            }
        }
        if (c1.isChecked()){
            if (c2.isChecked()){
                if (c8.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT"
                    );
                }
            }
        }
        if (c1.isChecked()){
            if (c2.isChecked()){
                if (c9.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT"
                    );
                }
            }
        }
        if (c1.isChecked()){
            if (c2.isChecked()){
                if (c10.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA V-BELT"
                    );
                }
            }
        }
        //================================================== ~1~ =================================================//

        //================================================== ~2~ =================================================//
        if (c2.isChecked()){
            if (c3.isChecked()){
                if (c4.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c2.isChecked()){
            if (c3.isChecked()){
                if (c5.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c2.isChecked()){
            if (c3.isChecked()){
                if (c6.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c2.isChecked()){
            if (c3.isChecked()){
                if (c7.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c2.isChecked()){
            if (c3.isChecked()){
                if (c8.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c2.isChecked()){
            if (c3.isChecked()){
                if (c9.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c2.isChecked()){
            if (c3.isChecked()){
                if (c10.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        //================================================== ~2~ =================================================//

        //================================================== ~3~ =================================================//
        if (c3.isChecked()){
            if (c4.isChecked()){
                if (c5.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c3.isChecked()){
            if (c4.isChecked()){
                if (c6.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c3.isChecked()){
            if (c4.isChecked()){
                if (c7.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c3.isChecked()){
            if (c4.isChecked()){
                if (c8.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c3.isChecked()){
            if (c4.isChecked()){
                if (c9.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        if (c3.isChecked()){
            if (c4.isChecked()){
                if (c10.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                    );
                }
            }
        }
        //================================================== ~3~ =================================================//

        //================================================== ~4~ =================================================//
        if(c4.isChecked()){
            if (c5.isChecked()){
                if(c6.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, BUSI"
                    );
                }
            }
        }
        if(c4.isChecked()){
            if (c5.isChecked()){
                if(c7.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, BUSI"
                    );
                }
            }
        }
        if(c4.isChecked()){
            if (c5.isChecked()){
                if(c8.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, ACCU"
                    );
                }
            }
        }
        if(c4.isChecked()){
            if (c5.isChecked()){
                if(c9.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, ACCU"
                    );
                }
            }
        }
        if(c4.isChecked()){
            if (c5.isChecked()){
                if(c10.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, KOMPONEN DINAMO STARTER"
                    );
                }
            }
        }
        //================================================== ~4~ =================================================//

        //================================================== ~5~ =================================================//
        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c7.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                    );
                }
            }
        }
        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c8.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR, BUSI, ACCU"
                    );
                }
            }
        }
        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c9.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR, BUSI, ACCU"
                    );
                }
            }
        }
        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c10.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR, BUSI, KOMPONEN DINAMO STARTER"
                    );
                }
            }
        }
        //================================================== ~5~ =================================================//

        //================================================== ~6~ =================================================//
        if(c6.isChecked()){
            if(c7.isChecked()){
                if(c8.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                    );
                }
            }
        }
        if(c6.isChecked()){
            if(c7.isChecked()){
                if(c9.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                    );
                }
            }
        }
        if(c6.isChecked()){
            if(c7.isChecked()){
                if(c10.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                    );
                }
            }
        }
        //================================================== ~6~ =================================================//

        //================================================== ~7~ =================================================//
        if(c7.isChecked()){
            if(c8.isChecked()){
                if(c9.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA ACCU"
                    );
                }
            }
        }
        if(c7.isChecked()){
            if(c8.isChecked()){
                if(c10.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA KOMPONEN DINAMO STARTER"
                    );
                }
            }
        }
        //================================================== ~7~ =================================================//

        //================================================== ~8~ =================================================//
        if(c8.isChecked()){
            if(c9.isChecked()){
                if(c10.isChecked()){
                    hasil.setText(
                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA KOMPONEN DINAMO STARTER"
                    );
                }
            }
        }
        //================================================== ~8~ =================================================//
    }

    @SuppressLint("SetTextI18n")
    private void checked4() {
        //================================================== ~1~ =================================================//
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c5.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c6.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c7.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c8.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c9.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c10.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        //================================================== ~1~ =================================================//

        //================================================== ~2~ =================================================//
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c6.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c7.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c8.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c9.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c10.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        //================================================== ~2~ =================================================//

        //================================================== ~3~ =================================================//
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c7.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c8.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c9.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c10.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                        );
                    }
                }
            }
        }
        //================================================== ~3~ =================================================//

        //================================================== ~4~ =================================================//
        if(c4.isChecked()){
            if(c5.isChecked()){
                if(c6.isChecked()){
                    if(c7.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                        );
                    }
                }
            }
        }
        if(c4.isChecked()){
            if(c5.isChecked()){
                if(c6.isChecked()){
                    if(c8.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA SENTRIFUGAL, INJECTOR, BUSI, ACCU"
                        );
                    }
                }
            }
        }
        if(c4.isChecked()){
            if(c5.isChecked()){
                if(c6.isChecked()){
                    if(c9.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA SENTRIFUGAL, INJECTOR, BUSI, ACCU"
                        );
                    }
                }
            }
        }
        if(c4.isChecked()){
            if(c5.isChecked()){
                if(c6.isChecked()){
                    if(c10.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA SENTRIFUGAL, INJECTOR, BUSI, KOMPONEN DINAMO STARTER"
                        );
                    }
                }
            }
        }
        //================================================== ~4~ =================================================//

        //================================================== ~5~ =================================================//
        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c7.isChecked()){
                    if(c8.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                        );
                    }
                }
            }
        }
        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c7.isChecked()){
                    if(c9.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                        );
                    }
                }
            }
        }
        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c7.isChecked()){
                    if(c10.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                        );
                    }
                }
            }
        }
        //================================================== ~5~ =================================================//

        //================================================== ~6~ =================================================//
        if(c6.isChecked()){
            if(c7.isChecked()){
                if(c8.isChecked()){
                    if(c9.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                        );
                    }
                }
            }
        }
        if(c6.isChecked()){
            if(c7.isChecked()){
                if(c8.isChecked()){
                    if(c10.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                        );
                    }
                }
            }
        }
        //================================================== ~6~ =================================================//

        //================================================== ~7~ =================================================//
        if(c7.isChecked()){
            if(c8.isChecked()){
                if(c9.isChecked()){
                    if(c10.isChecked()){
                        hasil.setText(
                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA ACCU"
                        );
                    }
                }
            }
        }
        //================================================== ~7~ =================================================//
    }

    @SuppressLint("SetTextI18n")
    private void checked5() {
        //================================================== ~1~ =================================================//
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c6.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c7.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c8.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c9.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c10.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        //================================================== ~1~ =================================================//

        //================================================== ~2~ =================================================//
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c7.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c8.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c9.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c10.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        //================================================== ~2~ =================================================//

        //================================================== ~3~ =================================================//
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c7.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN BUSI"
                            );
                        }
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c8.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c9.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c10.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                            );
                        }
                    }
                }
            }
        }
        //================================================== ~3~ =================================================//

        //================================================== ~4~ =================================================//
        if(c4.isChecked()){
            if(c5.isChecked()){
                if(c6.isChecked()){
                    if(c7.isChecked()){
                        if(c8.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                            );
                        }
                    }
                }
            }
        }
        if(c4.isChecked()){
            if(c5.isChecked()){
                if(c6.isChecked()){
                    if(c7.isChecked()){
                        if(c9.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                            );
                        }
                    }
                }
            }
        }
        if(c4.isChecked()){
            if(c5.isChecked()){
                if(c6.isChecked()){
                    if(c7.isChecked()){
                        if(c10.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI"
                            );
                        }
                    }
                }
            }
        }
        //================================================== ~4~ =================================================//

        //================================================== ~5~ =================================================//
        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c7.isChecked()){
                    if(c8.isChecked()){
                        if(c9.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR, BUSI, ACCU"
                            );
                        }
                    }
                }
            }
        }

        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c7.isChecked()){
                    if(c8.isChecked()){
                        if(c10.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR, BUSI, KOMPONEN DINAMO STARTER"
                            );
                        }
                    }
                }
            }
        }
        //================================================== ~5~ =================================================//

        //================================================== ~6~ =================================================//
        if(c6.isChecked()){
            if(c7.isChecked()){
                if(c8.isChecked()){
                    if(c9.isChecked()){
                        if(c10.isChecked()){
                            hasil.setText(
                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI DAN KOMPONEN DINAMO STARTER"
                            );
                        }
                    }
                }
            }
        }
        //================================================== ~6~ =================================================//
    }

    @SuppressLint("SetTextI18n")
    private void checked6() {
        //================================================== ~1~ =================================================//
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c7.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c8.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c9.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c10.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                                );
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~1~ =================================================//

        //================================================== ~2~ =================================================//
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c7.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR DAN BUSI"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c8.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c9.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c10.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL"
                                );
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~2~ =================================================//

        //================================================== ~3~ =================================================//
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c7.isChecked()){
                            if(c8.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR DAN BUSI"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c7.isChecked()){
                            if(c9.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR DAN BUSI"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c7.isChecked()){
                            if(c10.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR DAN BUSI"
                                );
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~3~ =================================================//

        //================================================== ~4~ =================================================//
        if(c4.isChecked()){
            if(c5.isChecked()){
                if(c6.isChecked()){
                    if(c7.isChecked()){
                        if(c8.isChecked()){
                            if(c9.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI DAN ACCU"
                                );
                            }
                        }
                    }
                }
            }
        }
        if(c4.isChecked()){
            if(c5.isChecked()){
                if(c6.isChecked()){
                    if(c7.isChecked()){
                        if(c8.isChecked()){
                            if(c10.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA BUSI DAN KOMPONEN DINAMO STARTER"
                                );
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~4~ =================================================//

        //================================================== ~5~ =================================================//
        if(c5.isChecked()){
            if(c6.isChecked()){
                if(c7.isChecked()){
                    if(c8.isChecked()){
                        if(c8.isChecked()){
                            if(c10.isChecked()){
                                hasil.setText(
                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR, BUSI DAN KOMPONEN DINAMO STARTER"
                                );
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~5~ =================================================//
    }

    @SuppressLint("SetTextI18n")
    private void checked7() {
        //================================================== ~1~ =================================================//
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c7.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, DAN BUSI"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c8.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN INJECTOR"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c9.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN INJECTOR"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c10.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL DAN INJECTOR"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~1~ =================================================//

        //================================================== ~2~ =================================================//
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c7.isChecked()){
                                if(c8.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, DAN BUSI"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c7.isChecked()){
                                if(c9.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, DAN BUSI"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c7.isChecked()){
                                if(c10.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, DAN BUSI"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~2~ =================================================//

        //================================================== ~3~ =================================================//
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c7.isChecked()){
                            if(c8.isChecked()){
                                if(c9.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, BUSI DAN ACCU"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c7.isChecked()){
                            if(c8.isChecked()){
                                if(c10.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, BUSI DAN KOMPONEN DINAMO STARTER"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~3~ =================================================//

        //================================================== ~4~ =================================================//
        if(c4.isChecked()){
            if(c4.isChecked()){
                if(c6.isChecked()){
                    if(c6.isChecked()){
                        if(c8.isChecked()){
                            if(c9.isChecked()){
                                if(c10.isChecked()){
                                    hasil.setText(
                                            "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN PADA INJECTOR, BUSI, ACCU, DAN KOMPONEN DINAMO STARTER"
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~4~ =================================================//
    }

    @SuppressLint("SetTextI18n")
    private void checked8() {
        //================================================== ~1~ =================================================//
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c7.isChecked()){
                                    if(c8.isChecked()){
                                        hasil.setText(
                                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR, DAN BUSI"
                                        );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c7.isChecked()){
                                    if(c9.isChecked()){
                                        hasil.setText(
                                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR, DAN BUSI"
                                        );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c7.isChecked()){
                                    if(c10.isChecked()){
                                        hasil.setText(
                                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR, DAN BUSI"
                                        );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~1~ =================================================//

        //================================================== ~2~ =================================================//
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c7.isChecked()){
                                if(c8.isChecked()){
                                    if(c9.isChecked()){
                                        hasil.setText(
                                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR, BUSI DAN ACCU"
                                        );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c7.isChecked()){
                                if(c8.isChecked()){
                                    if(c10.isChecked()){
                                        hasil.setText(
                                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR, BUSI DAN KOMPONEN DINAMO STARTER"
                                        );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~2~ =================================================//

        //================================================== ~3~ =================================================//
        if(c3.isChecked()){
            if(c4.isChecked()){
                if(c5.isChecked()){
                    if(c6.isChecked()){
                        if(c7.isChecked()){
                            if(c8.isChecked()){
                                if(c9.isChecked()){
                                    if(c10.isChecked()){
                                        hasil.setText(
                                                "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR, BUSI DAN KOMPONEN DINAMO STARTER"
                                        );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~3~ =================================================//
    }

    @SuppressLint("SetTextI18n")
    private void checked9() {
        //================================================== ~1~ =================================================//
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c7.isChecked()){
                                    if(c8.isChecked()){
                                        if(c9.isChecked()){
                                            hasil.setText(
                                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR, BUSI DAN ACCU"
                                            );
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c7.isChecked()){
                                    if(c8.isChecked()){
                                        if(c10.isChecked()){
                                            hasil.setText(
                                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR, BUSI DAN KOMPONEN DINAMO STARTER"
                                            );
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~1~ =================================================//

        //================================================== ~2~ =================================================//
        if(c2.isChecked()){
            if(c3.isChecked()){
                if(c4.isChecked()){
                    if(c5.isChecked()){
                        if(c6.isChecked()){
                            if(c7.isChecked()){
                                if(c8.isChecked()){
                                    if(c9.isChecked()){
                                        if(c10.isChecked()){
                                            hasil.setText(
                                                    "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJEKTOR, BUSI DAN KOMPONEN DINAMO STARTER"
                                            );
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //================================================== ~2~ =================================================//
    }

    @SuppressLint("SetTextI18n")
    private void checked10() {
        if(c1.isChecked()){
            if(c2.isChecked()){
                if(c3.isChecked()){
                    if(c4.isChecked()){
                        if(c5.isChecked()){
                            if(c6.isChecked()){
                                if(c7.isChecked()){
                                    if(c8.isChecked()){
                                        if(c9.isChecked()){
                                            if(c10.isChecked()){
                                                hasil.setText(
                                                        "MENURUT DIAGNOSA SISTEM, MOTOR ANDA MENGALAMI GANGGUAN ATAU KERUSAKAN KOMPAS KOPLING SENTRIFUGAL, INJECTOR, BUSI, ACCU, DAN KOMPONEN DINAMO STARTER"
                                                );
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}