public class Overloaded_Method {
    public static double convertToCentimeters(int height) {

        double real_height = height * 2.54;
        return real_height;
    }

    public static double convertToCentimeters(int height_in_feet, int height_in_inches) {
        double just_in_inches = ((height_in_inches + (height_in_feet) * 12) * 2.54);
        return just_in_inches;
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(12));
        System.out.println(convertToCentimeters(6, 3));
    }
}
