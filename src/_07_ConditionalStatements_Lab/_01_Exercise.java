// Напише конзолна програма, която чете оценка (реално число), въведена от потребителя, и отпечатва "Excellent!" ако оценката е 5.50 или по-висока.

package _07_ConditionalStatements_Lab;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведете оценка: ");
        double input = Double.parseDouble(s.nextLine());
        if (input >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}
