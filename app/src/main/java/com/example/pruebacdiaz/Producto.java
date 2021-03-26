package com.example.pruebacdiaz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;

import androidx.annotation.Nullable;

public class Producto {
    private String Nombre;
    private int Precio;

    public Producto(String nombre, int precio) {
        this.Nombre = nombre;
        this.Precio= precio;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public Producto() {


    }

}