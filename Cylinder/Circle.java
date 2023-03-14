package Cylinder;

public class Circle {
    double radius;
    Circle(double radius){
        this.radius =radius;
        if (radius < 0) {
            radius = 0;
        }
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

}
