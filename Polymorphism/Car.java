package Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }
    public String startEngine(){
        return "The car's engine is starting...";
    }
    public String accelerate(){
        return "The car is accelerating...";
    }
    public String brake(){
        return "The car is braking...";
    }
    public int GetCylinders(){
        return cylinders;
    }
    public String GetName(){
        return name;
    }
}
