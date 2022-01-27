package com.codelabs.diagnosakerusakanmotormatik.activity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "B"; private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table tiga" +
                "(id integer primary key," +
                "nama text null," +
                "nilai text null," +
                "hasil text null," +
                "Vbelt text null," +
                "Kopling Text null," +
                "Injektor text null," +
                "Busi text null," +
                "Accu text null," +
                "Dinamo text null);";
        Log.d("Data","onCreate: " + sql); db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1,int arg2) {

    }
}
