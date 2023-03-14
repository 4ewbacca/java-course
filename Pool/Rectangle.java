package Pool;

public class Rectangle {
    double width;
    double length;
    Rectangle(double width, double length){
        this.width = width;
        if (width < 0) {
            width = 0;
        }
        this.length = length;
        if (length < 0) {
            length = 0;
        }
    }
    public double getWidth(){
        return  width;
    }
    public double getLength(){
        return  length;
    }

    public double getArea(){
        return  length*width;
    }
}
