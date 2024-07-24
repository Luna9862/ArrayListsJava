package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int input;

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            integers.add(input);
        }

        int sum = calculateSum(integers);
        System.out.print("The list of the integers are: ");
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println("");
        System.out.print("The sum of the list is: " + sum);

    }

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
}
