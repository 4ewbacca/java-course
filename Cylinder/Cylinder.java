package Cylinder;

public class Cylinder extends Circle {
    double height;
    Cylinder(double height, double radius){
        super(radius);
        this.height =height;
        if (height < 0) {
            height = 0;
        }


    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return height*getArea();
    }

}
