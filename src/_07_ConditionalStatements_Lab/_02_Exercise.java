/*
Да се напише програма, която чете две цели числа, въведени от потребителя, и отпечатва по-голямото от двете.
 */
package _07_ConditionalStatements_Lab;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Въведи стойност за \"a\": ");
        a = Integer.parseInt(s.nextLine());
        System.out.println("Въведи стойност за \"b\": ");
        b = Integer.parseInt(s.nextLine());

        if (a > b) {
            System.out.println("По-голямото число е \"а\"");
        } else {
            System.out.println("По-голямото число е \"b\"");
        }

    }
}
