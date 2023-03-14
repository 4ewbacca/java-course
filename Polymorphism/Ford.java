package Polymorphism;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return "The Ford's engine is starting...";
    }
    public String accelerate(){
        return "The Ford is accelerating...";
    }
    public String brake(){
        return "The Ford is braking...";
    }
}
