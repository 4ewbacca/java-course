package Polymorphism;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return "The Mitsubishi's engine is starting...";
    }
    public String accelerate(){
        return "The Mitsubishi is accelerating...";
    }
    public String brake(){
        return "The Mitsubishi is braking...";
    }
}
