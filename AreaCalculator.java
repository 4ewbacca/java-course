import static java.lang.Math.PI;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double circle = radius * radius * PI;
            return circle;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            double rectangle = x * y;
            return rectangle;
        }
    }

    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(3, 3));
    }
}

