package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        String input;

        System.out.println("Enter strings (enter 0 to display fifth item):");

        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        if (strings.size() >= 5) {
            System.out.println("The fifth item in the list is: " + strings.get(4));
        } else {
            System.out.println("You did not enter at least five strings.");
        }
    }
}
