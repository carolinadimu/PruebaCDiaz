package com.example.pruebacdiaz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BBDDSQL extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Producto.db";

    private BBDDSQL datos;
    private SQLiteDatabase db;

    public BBDDSQL(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + Base.Inventory.TABLE_NAME + " ("

                + Base.Inventory.Producto + " TEXT NOT NULL,"
                + Base.Inventory.Precio + " INTEGER NOT NULL)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }

}