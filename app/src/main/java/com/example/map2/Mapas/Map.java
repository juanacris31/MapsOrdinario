package com.example.map2.Mapas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.AlphabeticIndex;
import android.os.Bundle;

import com.example.map2.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends AppCompatActivity implements OnMapReadyCallback {
    Intent recuperar;
    double longitud;
    double latitud;
    String nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment supportMapFragment;
        supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        supportMapFragment.getMapAsync(this);
        recuperar = getIntent();
            longitud = recuperar.getDoubleExtra("longitud",0);
        latitud = recuperar.getDoubleExtra("latitud",0);
        nombre = recuperar.getStringExtra("nombre");

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    MarkerOptions markerOptions = new MarkerOptions();
    markerOptions.position(new LatLng(longitud,latitud));
    markerOptions.title(nombre);
    googleMap.addMarker(markerOptions);
    googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(markerOptions.getPosition()).zoom(30).build()));

    }

}