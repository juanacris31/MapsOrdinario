package com.example.map2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.map2.Adaptador.Adaptador;
import com.example.map2.Entidades.Ubicacion;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ViewPager viewPager;
    Adaptador adaptador;
    ArrayList<Ubicacion> Ubicaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);

        Ubicaciones = new ArrayList<>();

        crearUbicaciones();

        adaptador = new Adaptador(Ubicaciones,this);
        viewPager.setAdapter(adaptador);
        viewPager.setPadding(50,0,50,0);
    }

    private void crearUbicaciones() {
        Ubicaciones.add(new Ubicacion("Parque Hidalgo", R.drawable.parque));
        Ubicaciones.add(new Ubicacion("Unistmo", R.drawable.uni));
        Ubicaciones.add(new Ubicacion("Manzur", R.drawable.manzur));
        Ubicaciones.add(new Ubicacion("Garibaldi",R.drawable.gari));


    }
}