package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText)findViewById(R.id.nombreEditText);
    }


    public void principal(View view){
        //EditText nombreEditText = findViewById(R.id.nombreEditText);
        //Log.i("Nombre: ", nombreEditText.getText().toString());
        String nom = nombre.getText().toString();

        if( !nom.isEmpty() ){
            Intent principal = new Intent(this, Principal.class);
            startActivity(principal);
        }else{
            Toast.makeText(this, "El usuario no existe", Toast.LENGTH_SHORT).show();
        }
    }


    public void registrar(View view){
        Intent usuarios = new Intent(this, Usuarios.class);
        startActivity(usuarios);
    }

    //Metodo de prueba
    /*public void Categorias(View view){
        Intent categorias = new Intent(this, CategoriasProductos.class);
        startActivity(categorias);
    }*/
}