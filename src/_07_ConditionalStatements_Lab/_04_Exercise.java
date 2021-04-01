package _07_ConditionalStatements_Lab;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи цяло число: ");
        int input = Integer.parseInt(s.nextLine());
        if (input == 1) {
            System.out.println("Едно");
        } else if (input == 2) {
            System.out.println("Две");
        } else if (input == 3) {
            System.out.println("Три");
        } else if (input == 4) {
            System.out.println("Четири");
        } else if (input == 5) {
            System.out.println("Пет");
        } else if (input == 6) {
            System.out.println("Шест");
        } else if (input == 7) {
            System.out.println("Седем");
        } else if (input == 8) {
            System.out.println("Осем");
        } else if (input == 9) {
            System.out.println("Девет");
        } else {
            System.out.println("Number too big! ");
        }
    }
}
