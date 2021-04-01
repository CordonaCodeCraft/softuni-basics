/*
Да се напише програма, която чете скорост (реално число), въведена от потребителя и отпечатва информация за скоростта.
При скорост до 10 (включително) отпечатайте “slow”. При скорост над 10 и до 50 отпечатайте “average”.
При скорост над 50 и до 150 отпечатайте “fast”.
При скорост над 150 и до 1000 отпечатайте “ultra fast”. При по-висока скорост отпечатайте “extremely fast”.
 */
package _08_ConditionalStatements_Exercises;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Prompt user to enter speed
        System.out.print("Въведете скорост: ");
        double input = Double.parseDouble(s.nextLine());
        if (input <= 10) {
            System.out.println("slow");
        } else if (input > 10 && input < 50) {
            System.out.println("average");
        } else if (input > 50 && input <= 150) {
            System.out.println("fast");
        } else if (input > 150 && input <= 1000) {
            System.out.println("ultrafast");
        } else {
            System.out.println("extremely fast");
        }
    }
}