package com.example.demo.backgrounddemoapp;

import android.graphics.Bitmap;

public class Car {

    private String model;
    private String year;
    private String pictureUrl;

    public Car(String model, String year, String pictureUrl) {
        this.model = model;
        this.year = year;
        this.pictureUrl = pictureUrl;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
