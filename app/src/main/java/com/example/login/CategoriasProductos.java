package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class CategoriasProductos extends AppCompatActivity {

    private Spinner spFrutas, spLacteos, spZumos, spLimpieza,spAperitivos, spGranos, spCarnes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_productos);
        datosDesing();
        cargarComboBox();
    }

    public void datosDesing(){
        spFrutas = (Spinner)findViewById(R.id.spFrutasVerduras);
        spLacteos = (Spinner)findViewById(R.id.spLacteos);
        spZumos = (Spinner)findViewById(R.id.spZumosBebidas);
        spLimpieza = (Spinner)findViewById(R.id.spLimpieza);
        spAperitivos = (Spinner)findViewById(R.id.spAperitivos);
        spGranos = (Spinner)findViewById(R.id.spGranosAceites);
        spCarnes = (Spinner)findViewById(R.id.spCarnes);
    }

    ArrayList<String> listacompra = new ArrayList<String>();
    public void cargarComboBox(){
        String[] frutas = {"FRUTAS Y VERDURAS","Platanos","Manzanas","Uvas","Peras","Sandias","Melones","Pimientos","Tomates","Limones","Lechugas"};
        String[] lacteos = {"LACTEOS","Leche","Yogurt","Queso","Helado","Kefir","Mantequilla","Nata"};
        String[] zumos = {"BEBIDAS Y ZUMOS","Cola Fanta","Agua","Jugo Tang","Jugo Pulp","Cola Big","Te Suntea","Cola Fioravanti"};
        String[] limpieza= {"LIMPEZA Y ASEO","Cepillos","Jabones","Dentrificos","Papel Higenico","Shampoo","Desodorantes","Esponjas Lavar","Detergente","Lustramuebles","Quitamanchas"};
        String[] aperitivos = {"APERITIVOS","Papas Fritas","Palomitas","Ruffles","Doritos","Galletas","Ciruelas","Chocolates","Nueces"};
        String[] granos = {"GRANOS","Frejol","Cereales","Almendras","Semillas","Harinas","Almidones"};
        String[] carnes = {"CARNES","Pescado","Salchichas","Mortadela","Camarones","Carne de Ress","Carne de Cerdo","Chuletas","Atun","Mortadela"};

        ArrayAdapter<String> adapterF = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, frutas);
        spFrutas.setAdapter(adapterF);
        listacompra.add(spFrutas.getSelectedItem().toString());

        ArrayAdapter<String> adapterLT = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lacteos);
        spLacteos.setAdapter(adapterLT);
        listacompra.add(spLacteos.getSelectedItem().toString());

        ArrayAdapter<String> adapterZ = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, zumos);
        spZumos.setAdapter(adapterZ);
        listacompra.add( spZumos.getSelectedItem().toString());

        ArrayAdapter<String> adapterLP = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, limpieza);
        spLimpieza.setAdapter(adapterLP);
        listacompra.add(spLimpieza.getSelectedItem().toString());

        ArrayAdapter<String> adapterAP = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, aperitivos);
        spAperitivos.setAdapter(adapterAP);
        listacompra.add(spAperitivos.getSelectedItem().toString());

        ArrayAdapter<String> adapterG = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, granos);
        spGranos.setAdapter(adapterG);
        listacompra.add(spGranos.getSelectedItem().toString());

        ArrayAdapter<String> adapterC = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,carnes);
        spCarnes.setAdapter(adapterC);
        /*spCarnes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {*/
                listacompra.add(spCarnes.getSelectedItem().toString());
            //}
        //});
    }

    public void verLista(View view){
        Intent categorias = new Intent(this, listadoProductos.class);
        startActivity(categorias);
    }
}