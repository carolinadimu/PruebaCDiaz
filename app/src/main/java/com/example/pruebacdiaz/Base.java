package com.example.pruebacdiaz;


import android.provider.BaseColumns;

public class Base {

    public static abstract class Inventory implements BaseColumns {

        public static final String TABLE_NAME ="Inventario";
        public static final String Producto  = "NombreProducto";
        public static final String Precio = "CostoUnitario";


    }
}
