package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listadoProductos extends AppCompatActivity {

    private ListView lvProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_productos);
        lvProductos = (ListView)findViewById(R.id.lvProductos);
        cargarLista();
    }

    public void cargarLista(){
        CategoriasProductos cp = new CategoriasProductos();
        ArrayAdapter<String> adapters = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cp.listacompra);
        lvProductos.setAdapter(adapters);
    }


}