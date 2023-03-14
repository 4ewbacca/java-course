public class SimpleCalculator {
    private static double firstNumber;
    private static double secondNumber;
    public  static double getFirstNumber(){
        return firstNumber;
    }
    public  static double getSecondNumber(){
        return secondNumber;
    }
    public  static double setFirstNumber(double a) {
        return firstNumber = a;
    }
    public  static double setSecondNumber(double a) {
        return secondNumber = a;
    }
    public  static double getAdditionResult() {
        return secondNumber + firstNumber;
    }
    public  static double getSubtractionResult() {
        return secondNumber - firstNumber;
    }
    public  static double getMultiplicationResult() {
        return secondNumber * firstNumber;
    }
    public  static double getDivisionResult () {
        if (secondNumber ==0){
            return 0;
        }else{
            return firstNumber / secondNumber;
        }
    }
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
