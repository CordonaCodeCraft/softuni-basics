// Да се напише програма, която чете цяло число, въведено от потребителя, и проверява дали е под 100, между 100 и 200 или над 200.

package _07_ConditionalStatements_Lab;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи число: ");
        int input = Integer.parseInt(s.nextLine());
        if (input < 100) {
            System.out.println("Less than 100");
        } else if (input > 100 && input < 200) {
            System.out.println("Betwen 100 and 200");
        } else if (input > 200) {
            System.out.println("Greater than 200");
        }

    }
}
