package com.example.pruebacdiaz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Fcrud {
    private BBDDSQL Bdatos;
    private SQLiteDatabase db;
    private ContentValues values = new ContentValues();

    public Fcrud(Context context) {
        Bdatos = new BBDDSQL(context);
    }

    public Fcrud() {

    }

    public void insertar(Producto n) {
        db = Bdatos.getWritableDatabase();
        values.clear();
        values.put(Base.Inventory.Producto, n.getNombre());
        values.put(Base.Inventory.Precio, n.getPrecio());
        db.insert(Base.Inventory.TABLE_NAME, null, values);
        //  db.close();
    }
}
