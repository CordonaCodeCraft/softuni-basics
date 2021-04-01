/*
Да се напише програма, която чете парола (един ред с произволен текст), въведена от потребителя, и проверява дали въведеното съвпада с фразата "s3cr3t!P@ssw0rd".
При съвпадение да се изведе "Welcome".
При несъвпадение да се изведе "Wrong password!".
 */
package _07_ConditionalStatements_Lab;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter password: ");
        String input = s.nextLine();
        if (input.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
