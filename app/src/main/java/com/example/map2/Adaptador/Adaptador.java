package com.example.map2.Adaptador;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.map2.Entidades.Ubicacion;
import com.example.map2.Mapas.Map;
import com.example.map2.R;

import java.util.ArrayList;

public class Adaptador extends PagerAdapter {
    ArrayList<Ubicacion> Ubicaciones;
    LayoutInflater layoutInflater;
    Context context;

    public Adaptador(ArrayList<Ubicacion> ubicaciones, Context context) {
        Ubicaciones = ubicaciones;
        this.context = context;
    }

    @Override
    public int getCount() {
      return Ubicaciones.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
       return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.items,container,false);
        ImageView img1;
        TextView nom;
        TextView des;
        img1 = view.findViewById(R.id.img1);
        nom = view.findViewById(R.id.txtNombre);
        img1.setImageResource(Ubicaciones.get(position).getNumImagen());
        nom.setText(Ubicaciones.get(position).getNombre());
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Map.class);
                switch (nom.getText()+""){

                    case "Parque Hidalgo":

                        intent.putExtra("latitud",-95.09848436061034);
                        intent.putExtra("longitud", 16.568287623078557);
                        intent.putExtra("nombre",nom.getText());
                        context.startActivity(intent);
                        break;
                        case "Unistmo":

                        intent.putExtra("latitud",-95.12286707595334);
                        intent.putExtra("longitud",16.559944655009303);
                        intent.putExtra("nombre",nom.getText());
                        context.startActivity(intent);
                        break;
                    case "Manzur":
                        intent.putExtra("latitud",-95.09526206061048);
                        intent.putExtra("longitud",16.556308337153244);
                        intent.putExtra("nombre",nom.getText());
                        context.startActivity(intent);
                        break;

                    case "Garibaldi":
                    intent.putExtra("latitud",-95.0957351606105);
                        intent.putExtra("longitud",16.55656519303858);
                        intent.putExtra("nombre",nom.getText());
                        context.startActivity(intent);
                        break;

                }
            }
        });
        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
      container.removeView((View) object);
    }
}
