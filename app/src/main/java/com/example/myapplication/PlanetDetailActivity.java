package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlanetDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_detail);

        Planet planet = (Planet) getIntent().getSerializableExtra("planet");

        // Set the data into the views
        ((TextView) findViewById(R.id.detail_planet_name)).setText(planet.getName());
        ((ImageView) findViewById(R.id.detail_image)).setImageResource(planet.getImageResourceId());

        // Set additional details
        ((TextView) findViewById(R.id.detail_distance)).setText(planet.getDistanceFromSun());
        ((TextView) findViewById(R.id.tvName)).setText("Name: " + planet.getName());
        ((TextView) findViewById(R.id.tvMass)).setText("Mass: " + planet.getMass());
        ((TextView) findViewById(R.id.tvDensity)).setText("Density: " + planet.getDensity());
        ((TextView) findViewById(R.id.tvTemperature)).setText("Temperature: " + planet.getTemperature());
        ((TextView) findViewById(R.id.tvRotationPeriod)).setText("Rotation Period: " + planet.getRotationPeriod());
    }
}
