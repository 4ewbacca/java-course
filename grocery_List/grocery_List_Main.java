package grocery_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.exit;

public class grocery_List_Main {
    static ArrayList<String> groceries = new ArrayList<String>();
    public static void request(int a) throws IOException {
        if (a == 0){
            exit(0);
        }
        if (a == 1){
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String input = reader.readLine();
            if (!groceries.contains(input)){
                System.out.print("Add product ");
                groceries.add(input);
            }
        }
        if (a == 2){
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String input = reader.readLine();
            System.out.print("Remove product ");
            groceries.remove(input);


        }
    }
    public static void main(String[] args) throws IOException {
        while (true){
            System.out.println("Available actions:");
            System.out.println("0 - to shutdown");
                    System.out.println("1 - to add item(s) to list (comma delimited list)");
                            System.out.println("2 - to remove any items (comma delimited list)");

            System.out.print("Your list:");
            Collections.sort(groceries, String.CASE_INSENSITIVE_ORDER);
            System.out.println(groceries);
            System.out.println("Enter a number for which action you want to do:");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            request(Integer.parseInt(reader.readLine()));


        }
    }
}
