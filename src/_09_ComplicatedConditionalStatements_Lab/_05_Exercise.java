package _09_ComplicatedConditionalStatements_Lab;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи число различно от нула в интервала -100/+100: ");
        int input = s.nextInt();
        boolean result = input >= -100 && input <= 100 && input != 0;
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
