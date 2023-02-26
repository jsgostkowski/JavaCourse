package nauka;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private static List<Car> ekstensja = new ArrayList<>();


    public static List<Car> getEkstensja() {
        return ekstensja;
    }

    public static void setEkstensja(List<Car> ekstensja) {
        Car.ekstensja = ekstensja;
    }

    public Car(String make, String model, String color, int doors) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        ekstensja.add(this);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }
}
