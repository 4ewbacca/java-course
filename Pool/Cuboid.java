package Pool;

public class Cuboid extends Rectangle {
    double height;
    Cuboid(double height, double lenght, double width){
        super(lenght, width);
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
