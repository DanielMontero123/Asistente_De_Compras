package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void entrar(View view){
        /*EditText cedulaEditText = findViewById(R.id.nombreEditText);
        Log.i("Cédula: ", cedulaEditText.getText().toString());
        */
        Intent usuarios = new Intent(this, Usuarios.class);
        startActivity(usuarios);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo de prueba
    /*public void Categorias(View view){
        Intent categorias = new Intent(this, CategoriasProductos.class);
        startActivity(categorias);
    }*/
}