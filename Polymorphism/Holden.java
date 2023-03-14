package Polymorphism;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return "The Holden's engine is starting...";
    }
    public String accelerate(){
        return "The Holden is accelerating...";
    }
    public String brake(){
        return "The Holden is braking...";
    }
}
