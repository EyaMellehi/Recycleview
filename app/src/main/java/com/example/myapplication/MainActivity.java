package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewPlanets);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", "57.91 million km", "3.285 × 10^23 kg", "5.43 g/cm³", "167°C", "58.6 days", R.drawable.mercure));
        planets.add(new Planet("Venus", "108.2 million km", "4.867 × 10^24 kg", "5.24 g/cm³", "464°C", "243 days", R.drawable.venus));
        planets.add(new Planet("Earth", "149.6 million km", "5.972 × 10^24 kg", "5.51 g/cm³", "15°C", "24 hours", R.drawable.terrestre));
        planets.add(new Planet("Mars", "227.9 million km", "6.417 × 10^23 kg", "3.93 g/cm³", "-65°C", "24.6 hours", R.drawable.mars));
        planets.add(new Planet("Jupiter", "778.5 million km", "1.898 × 10^27 kg", "1.33 g/cm³", "-145°C", "9.93 hours", R.drawable.jupiter));
        planets.add(new Planet("Saturn", "1.429 billion km", "5.683 × 10^26 kg", "0.69 g/cm³", "-178°C", "10.7 hours", R.drawable.saturn));
        planets.add(new Planet("Uranus", "2.871 billion km", "8.681 × 10^25 kg", "1.27 g/cm³", "-224°C", "17.2 hours", R.drawable.uranus));
        planets.add(new Planet("Neptune", "4.495 billion km", "1.024 × 10^26 kg", "1.64 g/cm³", "-218°C", "16.1 hours", R.drawable.neptune));
        planets.add(new Planet("Ceres", "413.7 million km", "9.393 × 10^20 kg", "2.16 g/cm³", "-105°C", "9 hours", R.drawable.ceres));
        planets.add(new Planet("The Sun", "0 km", "1.989 × 10^30 kg", "1.41 g/cm³", "5500°C", "25–35 days", R.drawable.soleil));

        PlanetAdapter adapter = new PlanetAdapter(this,planets);
        recyclerView.setAdapter(adapter);

    }
}