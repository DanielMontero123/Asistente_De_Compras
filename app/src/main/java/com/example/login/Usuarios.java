package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Usuarios extends AppCompatActivity {
    //ArrayList<String> usuario = new ArrayList<>();
    private EditText cedula, nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
        cedula = findViewById(R.id.TxtCed);
        nombre = findViewById(R.id.TxtNom);
    }

    public boolean userExit(){
        User usuario = new User(this, "SUPERMERCADO", null, 1);
        SQLiteDatabase baseDatos = usuario.getWritableDatabase();
        String ced = cedula.getText().toString();
        Cursor fila = baseDatos.rawQuery("select * from USUARIOS where CEDULA =" + ced, null);
        if ( fila.moveToFirst() ){
            return true;
        }else{
            return false;
        }
    }

    public void registrar(){
        User usuario = new User(this, "SUPERMERCADO", null, 1);
        SQLiteDatabase baseDatos = usuario.getWritableDatabase();
        String ced = cedula.getText().toString();
        String nom = nombre.getText().toString();
            ContentValues registro = new ContentValues();
            registro.put("CEDULA", ced);
            registro.put("NOMBRE", nom);

            baseDatos.insert("USUARIOS", null, registro);
            baseDatos.close();
            cedula.setText("");
            nombre.setText("");
            //mensage de registro existo;
            Toast.makeText(this, "registro existo", Toast.LENGTH_SHORT).show();
    }

    public void guardarUsuarios(View view){
        String ced = cedula.getText().toString();
        String nom = nombre.getText().toString();
        if( !ced.isEmpty() || !nom.isEmpty()  ){
            //usuario.add(cedula.getText().toString());
            if( userExit() == true ){
                Toast.makeText(this, "EL usuario ya existe", Toast.LENGTH_SHORT).show();
            }else {
                registrar();
                Intent categorias = new Intent(this, MainActivity.class);
                startActivity(categorias);
            }
        }else{
            Toast.makeText(this, "Llene los campos", Toast.LENGTH_SHORT).show();
        }
    }

}