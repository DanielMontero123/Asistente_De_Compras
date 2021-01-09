package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private EditText cedula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cedula = (EditText)findViewById(R.id.nombreEditText);
    }


    public void principal(View view){
        ArrayList<String> datos_usuario = new ArrayList<String>();

        String ced = cedula.getText().toString();
        if( !ced.isEmpty() ){
            User usuario = new User(this, "SUPERMERCADO", null, 1);
            SQLiteDatabase baseDatos = usuario.getWritableDatabase();
            Cursor fila = baseDatos.rawQuery("select * from USUARIOS where CEDULA =" + ced, null);
            if ( fila.moveToFirst() ){
                datos_usuario.add(fila.getString(0));
                datos_usuario.add(fila.getString(1));
                Intent principal = new Intent(this, Principal.class);
                startActivity(principal);
            }else{
                Toast.makeText(this, "El usuario no existe", Toast.LENGTH_SHORT).show();
            }
            baseDatos.close();
        }else{
            Toast.makeText(this, "Llene los campos", Toast.LENGTH_SHORT).show();
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