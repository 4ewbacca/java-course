package sortTheOdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static double[] sortOdd(double[] arr){
        List<Double> oddArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                oddArray.add(arr[i]);

            }

        }
        Collections.sort(oddArray);
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                arr[i] = oddArray.get(counter);
                counter++;
            }
        }
        return arr;

    }


    public static void main(String[] args) {

        double[] array2 = {5, 8, 6, 3, 4};
        double[] array3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        double[] array1 = {7, 1};

        System.out.println(Arrays.toString(sortOdd(array1))); // Output: [1, 7]
        System.out.println(Arrays.toString(sortOdd(array2))); // Output: [3, 8, 6, 5, 4]
        System.out.println(Arrays.toString(sortOdd(array3))); // Output: [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]



    }
}
