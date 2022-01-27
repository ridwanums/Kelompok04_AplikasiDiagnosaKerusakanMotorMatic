package com.codelabs.diagnosakerusakanmotormatik.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.codelabs.diagnosakerusakanmotormatik.R;

import java.text.DecimalFormat;

public class DiagnosaActivity extends AppCompatActivity {


    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    Button diagnosa;
    DecimalFormat f = new DecimalFormat("###");

    public static String Vbelt, Kopling, Injektor, Busi, Accu, Dinamo;
    double v1 = 0.067;

    double hasil;
    double hasil2;
    double hasil3;

    double hasil_akhir;

    double rumus_vbelt;
    double rumus_vbelt2;
    double rumus_vbelt3;
    double hasil_vbelt;

    double rumus_kopling;
    double rumus_kopling2;
    double hasil_kopling;

    double rumus_injektor;
    double rumus_injektor2;
    double hasil_injektor;

    double rumus_busi;
    double rumus_busi2;
    double hasil_busi;

    double rumus_accu;
    double rumus_accu2;
    double rumus_accu3;
    double hasil_accu;

    double rumus_dinamo;
    double rumus_dinamo2;
    double rumus_dinamo3;
    double hasil_dinamo;

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
        diagnosa    = findViewById(R.id.btn_diagnosa);

        Teorema();

    }

    private void Teorema() {


        diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vbelt = f.format(0);
                Kopling = f.format(0);
                Injektor = f.format(0);
                Busi = f.format(0);
                Accu = f.format(0);
                Dinamo = f.format(0);


                if (c1.isChecked()){
                    rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                    hasil = rumus_vbelt;
                    hasil_vbelt = rumus_vbelt*100;
                    Vbelt = f.format(hasil_vbelt);

                    rumus_kopling = (1*v1)/((1*v1)+(1*v1)+(1*v1)+(1*v1));
                    hasil = rumus_kopling;
                    hasil_kopling = rumus_kopling*100;
                    Kopling = f.format(hasil_kopling);

                }

                if (c2.isChecked()){
                    rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                    hasil = rumus_vbelt;
                    hasil_vbelt = rumus_vbelt*100;
                    Vbelt = f.format(hasil_vbelt);

                    rumus_kopling = (1*v1)/((1*v1)+(1*v1)+(1*v1)+(1*v1));
                    hasil = rumus_kopling;
                    hasil_kopling = rumus_kopling*100;
                    Kopling = f.format(hasil_kopling);

                }

                if (c3.isChecked()){
                    rumus_kopling = (1*v1)/((1*v1)+(1*v1)+(1*v1)+(1*v1));
                    hasil = rumus_kopling;
                    hasil_kopling = rumus_kopling*100;
                    Kopling = f.format(hasil_kopling);

                }

                if (c4.isChecked()){
                    rumus_kopling = (1*v1)/((1*v1)+(1*v1)+(1*v1)+(1*v1));
                    hasil = rumus_kopling;
                    hasil_kopling = rumus_kopling*100;
                    Kopling = f.format(hasil_kopling);

                }

                if (c5.isChecked()){
                    rumus_injektor = (1*v1)/(1*v1);
                    hasil = rumus_injektor;
                    hasil_injektor = rumus_injektor*100;
                    Injektor = f.format(hasil_injektor);

                }

                if (c6.isChecked()){
                    rumus_busi = (1*v1)/((1*v1)+(1*v1));
                    hasil_busi = rumus_busi*100;
                    Busi = f.format(hasil_busi);

                }

                if (c7.isChecked()){
                    rumus_busi = (1*v1)/((1*v1)+(1*v1));
                    hasil_busi = rumus_busi*100;
                    Busi = f.format(hasil_busi);

                }

                if (c8.isChecked()){
                    rumus_accu = (1*v1)/((1*v1)+(1*v1));
                    hasil_accu = rumus_accu*100;
                    Accu = f.format(hasil_accu);

                    rumus_dinamo = (1*v1)/((1*v1)+(1*v1)+(1*v1));
                    hasil_dinamo = rumus_dinamo*100;
                    Dinamo = f.format(hasil_dinamo);

                }

                if (c9.isChecked()){
                    rumus_accu = (1*v1)/((1*v1)+(1*v1));
                    hasil_accu = rumus_accu*100;
                    Accu = f.format(hasil_accu);

                    rumus_dinamo = (1*v1)/((1*v1)+(1*v1)+(1*v1));
                    hasil_dinamo = rumus_dinamo*100;
                    Dinamo = f.format(hasil_dinamo);

                }

                if (c10.isChecked()){
                    rumus_dinamo = (1*v1)/((1*v1)+(1*v1)+(1*v1));
                    hasil_dinamo = rumus_dinamo*100;
                    Dinamo = f.format(hasil_dinamo);

                }


                if(c1.isChecked()){
                    if (c2.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_vbelt2 = (1*v1)/((1*v1)+(1*v1));
                        hasil =  rumus_vbelt + rumus_vbelt2;
                        hasil_vbelt = hasil*100;
                        Vbelt = f.format(hasil_vbelt);

                        rumus_kopling = (1*v1)/((1*v1)+(1*v1)+(1*v1)+(1*v1));
                        rumus_kopling2 = (1*v1)/((1*v1)+(1*v1)+(1*v1)+(1*v1));
                        hasil2 = rumus_kopling + rumus_kopling2;
                        hasil_kopling = hasil2*100;
                        Kopling = f.format(hasil_kopling);
                    }
                }

                if(c1.isChecked()){
                    if (c3.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_kopling = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_kopling;

                        rumus_vbelt2 = (1*v1)/((1*v1)+(1*v1));
                        rumus_kopling2 = (1*v1)/(1*v1);
                        hasil2 = rumus_vbelt2+rumus_kopling2;

                        hasil_akhir = hasil+hasil2;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_kopling = (hasil2/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Kopling = f.format(hasil_kopling);


                    }
                }
//
                if(c1.isChecked()){
                    if (c4.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_kopling = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_kopling;

                        rumus_vbelt2 = (1*v1)/((1*v1)+(1*v1));
                        rumus_kopling2 = (1*v1)/(1*v1);
                        hasil2 = rumus_vbelt2+rumus_kopling2;

                        hasil_akhir = hasil+hasil2;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_kopling = (hasil2/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Kopling = f.format(hasil_kopling);
                    }
                }

                if(c1.isChecked()){
                    if (c5.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_injektor = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_injektor;

                        rumus_vbelt2 = (0*v1)/((1*v1));
                        rumus_injektor2 = (1*v1)/(1*v1);
                        hasil2 = rumus_vbelt2+rumus_injektor2;

                        hasil_akhir = hasil+hasil2;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_injektor = (hasil2/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Injektor = f.format(hasil_injektor);
                    }
                }

                if(c1.isChecked()){
                    if (c6.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_busi = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_busi;

                        rumus_vbelt2 = (0*v1)/((1*v1));
                        rumus_busi2 = (1*v1)/((1*v1)+(1*v1));
                        hasil2 = rumus_vbelt2+rumus_busi2;

                        hasil_akhir = hasil+hasil2;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_busi = (hasil2/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Busi = f.format(hasil_busi);
                    }
                }

                if(c1.isChecked()){
                    if (c7.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_busi = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_busi;

                        rumus_vbelt2 = (0*v1)/((1*v1));
                        rumus_busi2 = (1*v1)/((1*v1)+(1*v1));
                        hasil2 = rumus_vbelt2+rumus_busi2;

                        hasil_akhir = hasil+hasil2;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_busi = (hasil2/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Busi = f.format(hasil_busi);
                    }
                }

                if(c1.isChecked()){
                    if (c8.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_accu = (0*v1)/(1*v1);
                        rumus_dinamo = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_accu+rumus_dinamo;

                        rumus_vbelt2 = (0*v1)/((1*v1));
                        rumus_accu2 = (1*v1)/((1*v1)+(1*v1));
                        rumus_dinamo2=(1*v1)/((1*v1)+(1*v1)+(1*v1));
                        hasil2 = rumus_vbelt2+rumus_accu2+rumus_dinamo2;

                        rumus_vbelt3 = (0*v1)/((1*v1));
                        rumus_accu3 = (1*v1)/((1*v1)+(1*v1));
                        rumus_dinamo3=(1*v1)/((1*v1)+(1*v1)+(1*v1));
                        hasil3 = rumus_vbelt3+rumus_accu3+rumus_dinamo3;

                        hasil_akhir = hasil+hasil2+hasil3;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_accu = (hasil2/hasil_akhir)*100;
                        hasil_dinamo = (hasil3/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Accu = f.format(hasil_accu);
                        Dinamo = f.format(hasil_dinamo);
                    }
                }

                if(c1.isChecked()){
                    if (c9.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_accu = (0*v1)/(1*v1);
                        rumus_dinamo = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_accu+rumus_dinamo;

                        rumus_vbelt2 = (0*v1)/((1*v1));
                        rumus_accu2 = (1*v1)/((1*v1)+(1*v1));
                        rumus_dinamo2=(1*v1)/((1*v1)+(1*v1)+(1*v1));
                        hasil2 = rumus_vbelt2+rumus_accu2+rumus_dinamo2;

                        rumus_vbelt3 = (0*v1)/((1*v1));
                        rumus_accu3 = (1*v1)/((1*v1)+(1*v1));
                        rumus_dinamo3=(1*v1)/((1*v1)+(1*v1)+(1*v1));
                        hasil3 = rumus_vbelt3+rumus_accu3+rumus_dinamo3;

                        hasil_akhir = hasil+hasil2+hasil3;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_accu = (hasil2/hasil_akhir)*100;
                        hasil_dinamo = (hasil3/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Accu = f.format(hasil_accu);
                        Dinamo = f.format(hasil_dinamo);
                    }
                }

                if(c1.isChecked()){
                    if (c10.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_dinamo = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_dinamo;

                        rumus_vbelt2 = (0*v1)/((1*v1));
                        rumus_dinamo2 = (1*v1)/((1*v1)+(1*v1)+(1*v1));
                        hasil2 = rumus_vbelt2+rumus_dinamo2;

                        hasil_akhir = hasil+hasil2;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_dinamo = (hasil2/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Dinamo = f.format(hasil_accu);
                    }
                }



                if(c2.isChecked()){
                    if (c3.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_kopling = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_kopling;

                        rumus_vbelt2 = (1*v1)/((1*v1)+(1*v1));
                        rumus_kopling2 = (1*v1)/(1*v1);
                        hasil2 = rumus_vbelt2+rumus_kopling2;

                        hasil_akhir = hasil+hasil2;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_kopling = (hasil2/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Kopling = f.format(hasil_kopling);
                    }
                }
//
                if(c2.isChecked()){
                    if (c4.isChecked()){
                        rumus_vbelt = (1*v1)/((1*v1)+(1*v1));
                        rumus_kopling = (0*v1)/(1*v1);
                        hasil = rumus_vbelt+rumus_kopling;

                        rumus_vbelt2 = (1*v1)/((1*v1)+(1*v1));
                        rumus_kopling2 = (1*v1)/(1*v1);
                        hasil2 = rumus_vbelt2+rumus_kopling2;

                        hasil_akhir = hasil+hasil2;

                        hasil_vbelt = (hasil/hasil_akhir)*100;
                        hasil_kopling = (hasil2/hasil_akhir)*100;

                        Vbelt = f.format(hasil_vbelt);
                        Kopling = f.format(hasil_kopling);
                    }
                }
//
                if(c3.isChecked()){
                    if (c4.isChecked()){
                        rumus_kopling = (1*v1)/((1*v1)+(1*v1)+(1*v1)+(1*v1));
                        rumus_kopling2 = (1*v1)/((1*v1)+(1*v1)+(1*v1)+(1*v1));
                        hasil =  hasil_kopling+rumus_kopling2;
                        hasil_vbelt = hasil_vbelt*100;
                        Kopling = f.format(hasil_kopling);
                    }
                }


                if(c1.isChecked()){
                    if (c2.isChecked()){
                        if(c4.isChecked()) {
                            rumus_vbelt = (1*v1)/(1*v1)+(1*v1);
                            hasil = rumus_vbelt;
                            hasil_vbelt = ((rumus_vbelt/hasil)*100);
                            Vbelt = f.format(hasil_vbelt);

                            rumus_kopling = (1*v1)/(1*v1)+(1*v1)+(1*v1)+(1*v1);
                            hasil = rumus_kopling;
                            hasil_kopling = (((rumus_kopling/hasil)*100)*3)/4;
                            Kopling = f.format(hasil_kopling);
                        }
                    }
                }

                if(c1.isChecked()){
                    if (c3.isChecked()){
                        if(c4.isChecked()) {
                            rumus_vbelt = (1*v1)/(1*v1)+(1*v1);
                            hasil = rumus_vbelt;
                            hasil_vbelt = ((rumus_vbelt/hasil)*100)/2;
                            Vbelt = f.format(hasil_vbelt);

                            rumus_kopling = (1*v1)/(1*v1)+(1*v1)+(1*v1)+(1*v1);
                            hasil = rumus_kopling;
                            hasil_kopling = (((rumus_kopling/hasil)*100)*3)/4;
                            Kopling = f.format(hasil_kopling);
                        }
                    }
                }

                if(c2.isChecked()){
                    if (c3.isChecked()){
                        if(c4.isChecked()) {
                            rumus_vbelt = (1*v1)/(1*v1)+(1*v1);
                            hasil = rumus_vbelt;
                            hasil_vbelt = ((rumus_vbelt/hasil)*100)/2;
                            Vbelt = f.format(hasil_vbelt);

                            rumus_kopling = (1*v1)/(1*v1)+(1*v1)+(1*v1)+(1*v1);
                            hasil = rumus_kopling;
                            hasil_kopling = (((rumus_kopling/hasil)*100)*3)/4;
                            Kopling = f.format(hasil_kopling);
                        }
                    }
                }

                if(c1.isChecked()){
                    if (c2.isChecked()){
                        if(c3.isChecked()) {
                            if(c4.isChecked()){
                                rumus_vbelt = (1*v1)/(1*v1)+(1*v1);
                                hasil = rumus_vbelt;
                                hasil_vbelt = ((rumus_vbelt/hasil)*100);
                                Vbelt = f.format(hasil_vbelt);

                                rumus_kopling = (1*v1)/(1*v1)+(1*v1)+(1*v1)+(1*v1);
                                hasil = rumus_kopling;
                                hasil_kopling = (((rumus_kopling/hasil)*100));
                                Kopling = f.format(hasil_kopling);
                            }
                        }
                    }
                }

                if(c6.isChecked()){
                    if(c7.isChecked()){
                        rumus_busi = (1*v1)/(1*v1)+(1*v1);
                        hasil = rumus_busi;
                        hasil_busi = ((rumus_busi/hasil)*100);
                        Busi = f.format(rumus_busi);
                    }
                }

                if(c8.isChecked()){
                    if(c9.isChecked()){
                        rumus_accu = (1*v1)/(1*v1)+(1*v1);
                        hasil = rumus_accu;
                        hasil_accu = ((rumus_accu/hasil)*100)/2;
                        Accu = f.format(hasil_accu);

                        rumus_dinamo = (1*v1)/(1*v1)+(1*v1)+(1*v1);
                        hasil = rumus_dinamo;
                        hasil_dinamo = (((rumus_dinamo/hasil)*100)*2)/3;
                        Dinamo = f.format(hasil_dinamo);
                    }
                }

                if(c8.isChecked()){
                    if(c10.isChecked()){
                        rumus_accu = (1*v1)/(1*v1)+(1*v1);
                        hasil = rumus_accu;
                        hasil_accu = ((rumus_accu/hasil)*100)/2;
                        Accu = f.format(hasil_accu);

                        rumus_dinamo = (1*v1)/(1*v1)+(1*v1)+(1*v1);
                        hasil = rumus_dinamo;
                        hasil_dinamo = (((rumus_dinamo/hasil)*100)*2)/3;
                        Dinamo = f.format(hasil_dinamo);
                    }
                }

                if(c9.isChecked()){
                    if(c10.isChecked()){
                        rumus_accu = (1*v1)/(1*v1)+(1*v1);
                        hasil = rumus_accu;
                        hasil_accu = ((rumus_accu/hasil)*100)/2;
                        Accu = f.format(hasil_accu);

                        rumus_dinamo = (1*v1)/(1*v1)+(1*v1)+(1*v1);
                        hasil = rumus_dinamo;
                        hasil_dinamo = (((rumus_dinamo/hasil)*100)*2)/3;
                        Dinamo = f.format(hasil_dinamo);
                    }
                }

                if(c8.isChecked()){
                    if(c9.isChecked()){
                        if(c10.isChecked()){
                            rumus_dinamo = (1*v1)/(1*v1)+(1*v1)+(1*v1);
                            hasil = rumus_dinamo;
                            hasil_dinamo = (((rumus_dinamo/hasil)*100));
                            Dinamo = f.format(hasil_dinamo);
                        }
                    }
                }


                startActivity(new Intent(getApplicationContext(), HasilDiagnosaActivity.class));
            }
        });
    }
}