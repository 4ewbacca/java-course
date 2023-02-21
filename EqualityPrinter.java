public class EqualityPrinter {
    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.print("Invalid Value");
        } else {
            if (x == y && y == z)
                System.out.print("All numbers are equal");
            if ((x != y && y == z) || (x == y && y != z))
                System.out.print("Neither all are equal or different");
            if ((x != y && y != z && x != z))
                System.out.print("All numbers are different");
        }

    }

    public static void main(String[] args) {
        printEqual(2, 3, 1);
    }
}