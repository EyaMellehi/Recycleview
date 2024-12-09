package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlanetViewHolder extends RecyclerView.ViewHolder {
    TextView tvPlanetName;
    TextView tvdistance;
    ImageView imgPlanet;
    public PlanetViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPlanetName = itemView.findViewById(R.id.tvPlanetName);
        tvdistance=itemView.findViewById(R.id.tvdistance);
        imgPlanet = itemView.findViewById(R.id.imgPlanet);
    }
    void display(Planet planet){
        tvPlanetName.setText(planet.getName());
        tvdistance.setText(planet.getDistanceFromSun());
        imgPlanet.setImageResource(planet.getImageResourceId());
    }
}
