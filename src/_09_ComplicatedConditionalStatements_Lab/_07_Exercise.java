package _09_ComplicatedConditionalStatements_Lab;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи цяло число от 100 до 200: ");
        int input = s.nextInt();
        boolean flag = ((input >= 100 && input <= 200) || input == 0);
        if (!flag) {
            System.out.println("invalid");
        }
    }
}
