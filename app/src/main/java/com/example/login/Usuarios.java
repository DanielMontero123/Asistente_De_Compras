package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class Usuarios extends AppCompatActivity {
    ArrayList<String> usuario = new ArrayList<>();
    private EditText cedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
        cedula = findViewById(R.id.TxtCed);
    }

    public void guardarUsuarios(View view){
        usuario.add(cedula.getText().toString());
        Intent categorias = new Intent(this, CategoriasProductos.class);
        startActivity(categorias);
    }




}