package _09_ComplicatedConditionalStatements_Lab;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи пол: ");
        String gender = s.nextLine();
        System.out.print("Въведи възраст: ");
        int age = s.nextInt();
        if (gender.equals("f")) {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        }
    }
}
