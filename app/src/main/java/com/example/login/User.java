package com.example.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class User extends SQLiteOpenHelper {
    public User(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase baseDatos) {
        baseDatos.execSQL( "create table USUARIOS ( CEDULA text primary key, NOMBRE text )" );
        baseDatos.execSQL(" create table PRODUCTOS ( ID_PRO text primary key, NOM_PRO text )" );
        baseDatos.execSQL( "INSERT INTO  PRODUCTOS (ID_PRO, NOM_PRO) values ('','') " );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
