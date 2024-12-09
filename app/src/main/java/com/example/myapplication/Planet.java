package com.example.myapplication;

import java.io.Serializable;

public class Planet implements Serializable {
    private String name;
    private String distanceFromSun;
    private String mass;
    private String density;
    private String temperature;
    private String rotationPeriod;
    private int imageResourceId;
    public Planet(String name, String distanceFromSun, String mass, String density, String temperature, String rotationPeriod, int imageResourceId)  {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.density = density;
        this.temperature = temperature;
        this.rotationPeriod = rotationPeriod;
        this.imageResourceId = imageResourceId;
    }

    public String getName() { return name; }
    public String getDistanceFromSun() { return distanceFromSun; }
    public String getMass() { return mass; }
    public String getDensity() { return density; }
    public String getTemperature() { return temperature; }
    public String getRotationPeriod() { return rotationPeriod; }
    public int getImageResourceId() { return imageResourceId; }
    public void setName(String name) { this.name = name; }
    public void setDistanceFromSun(String distanceFromSun) { this.distanceFromSun = distanceFromSun; }
    public void setMass(String mass) { this.mass = mass; }
    public void setDensity(String density) { this.density = density; }
    public void setTemperature(String temperature) { this.temperature = temperature; }
    public void setRotationPeriod(String rotationPeriod) { this.rotationPeriod = rotationPeriod; }
    public void setImageResourceId(int imageResourceId) { this.imageResourceId = imageResourceId; }
}

