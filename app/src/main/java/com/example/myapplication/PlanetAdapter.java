package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetViewHolder> {
    private Context context;
    private List<Planet> planetList;

    public PlanetAdapter(Context context, List<Planet> planetList) {
        this.context = context;
        this.planetList = planetList;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_planet, parent, false);
        return new PlanetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        //holder.display(planetList.get(position));
        Planet planet = planetList.get(position);
        holder.tvPlanetName.setText(planet.getName());
        holder.tvdistance.setText(planet.getDistanceFromSun());
        holder.imgPlanet.setImageResource(planet.getImageResourceId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, PlanetDetailActivity.class);
            intent.putExtra("planet", planet); // Pass the planet object
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }
}
