package com.example.android.inclassassignment06_doraj;

import java.io.Serializable;

public class Water implements Serializable {

    public String brand;
    public String origin;
    public boolean purified;
    public boolean spring;
    public boolean alkaline;

    public Water(String brand, String origin) {
        this.brand = brand;
        this.origin = origin;
    }

    public String getBrand() {
        return brand;
    }

    public String getOrigin() {
        return origin;
    }

    public boolean isPurified() {
        return purified;
    }

    public boolean isSpring() {
        return spring;
    }

    public boolean isAlkaline() {
        return alkaline;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPurified(boolean purified) {
        this.purified = purified;
    }

    public void setSpring(boolean spring) {
        this.spring = spring;
    }

    public void setAlkaline(boolean alkaline) {
        this.alkaline = alkaline;
    }

    public String toString(){
        return "Water Brand: " + brand + "\nCountry of Origin: " + origin;
    }
}
