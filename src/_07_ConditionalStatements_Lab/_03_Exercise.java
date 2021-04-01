// Да се напише програма, която чете цяло число, въведено от потребителя, и печата дали е четно или нечетно.

package _07_ConditionalStatements_Lab;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи число: ");
        int userInput = Integer.parseInt(s.nextLine());
        if (userInput % 2 == 0) {
            System.out.println("Числото е четно");
        } else
            System.out.println("Числото е нечетно");
    }
}
