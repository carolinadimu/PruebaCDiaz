package com.example.pruebacdiaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNombre, etPrecio;
    Button btnGrabar, btnModificar, btnEliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre = (EditText) findViewById(R.id.etNombre);
        etPrecio = (EditText) findViewById(R.id.etPrecio);
        btnGrabar = (Button) findViewById(R.id.btnGrabar);
        btnModificar = (Button) findViewById(R.id.btnModificar);
        btnEliminar = (Button) findViewById(R.id.btnEliminar);

        btnGrabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Producto prod = new Producto();
                Fcrud mod = new Fcrud(getApplicationContext());
                prod.setNombre(etNombre.getText().toString());
                prod.setPrecio(Integer.parseInt(etPrecio.getText().toString()));
                mod.insertar(prod);
            }
        });


    } // fin metodo
}// fin clase