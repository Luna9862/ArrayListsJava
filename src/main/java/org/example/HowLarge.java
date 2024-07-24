package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        String input;

        System.out.println("Enter strings (when finished press enter to enter):");

        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        System.out.println("The total amount of items in the list was:  " + strings.size());

    }
}
