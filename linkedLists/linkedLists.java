package linkedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linkedLists {
    public static List<Double> mergeAndSort(double[]... args){
        List<Double> linkedList = new LinkedList<>();
        for (double[] arr:args){
            for (double num: arr)
            {
                linkedList.add(num);

            }
        }
        Collections.sort(linkedList);
        if (linkedList.size()>0){
            return linkedList;
        }else{
            return null;
        }



    }
    public static void main(String[] args) {
        double[] arr1 = {1.0, 4.0, 5.0};
        double[] arr2 = {1.0, 3.0, 4.0};
        double[] arr3 = {2.0,6.0};
        double[] arr4= {};
        System.out.println(mergeAndSort(arr1,arr2,arr3));
        System.out.println(mergeAndSort(arr4));
    }
}
