package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            integers.add(input);
        }

        System.out.println("Done entering integers to the list.");
        System.out.println("What number are you looking for in the list?");
        int numberToFind = scanner.nextInt();

        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i).equals(numberToFind)) {
                indices.add(i);
            }
        }

        if (!indices.isEmpty()) {
            System.out.println("The number " + numberToFind + " is found at the indexes: " + indices);
        } else {
            System.out.println("The number " + numberToFind + " is not in the list.");
        }
    }
}