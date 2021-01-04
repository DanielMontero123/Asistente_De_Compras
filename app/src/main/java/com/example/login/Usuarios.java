package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Usuarios extends AppCompatActivity {
    ArrayList<String> usuario = new ArrayList<>();
    private EditText cedula, nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
        cedula = findViewById(R.id.TxtCed);
        nombre = findViewById(R.id.TxtNom);
    }

    public void guardarUsuarios(View view){
        String ced = cedula.getText().toString();
        String nom = nombre.getText().toString();
        if( !ced.isEmpty() || !nom.isEmpty()  ){
            usuario.add(cedula.getText().toString());
            Intent categorias = new Intent(this, CategoriasProductos.class);
            startActivity(categorias);
        }else{
            Toast.makeText(this, "Llene los campos", Toast.LENGTH_SHORT).show();
        }

    }

}