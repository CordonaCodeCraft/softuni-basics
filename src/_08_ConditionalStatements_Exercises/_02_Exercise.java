/*
Дадено е цяло число – начален брой точки. Върху него се начисляват бонус точки по правилата, описани по-долу.
Да се напише програма, която пресмята бонус точките, които получава числото и общия брой точки (числото + бонуса).
• Ако числото е до 100 включително, бонус точките са 5.
• Ако числото е по-голямо от 100, бонус точките са 20% от числото.
• Ако числото е по-голямо от 1000, бонус точките са 10% от числото.

• Допълнителни бонус точки (начисляват се отделно от предходните):
o За четно число  + 1 т.
o За число, което завършва на 5  + 2 т.
*/

package _08_ConditionalStatements_Exercises;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// Prompt user to enter a number
        System.out.print("Въведи цяло число: ");
        int input = Integer.parseInt(s.nextLine());
        double bonusPoints = 0;
        if (input <= 100) {
            if (input % 2 == 0) {
                bonusPoints = 5 + 1;
            } else if (input % 10 == 5) {
                bonusPoints = 5 + 2;
            } else {
                bonusPoints = 5;
            }
        } else if (input > 100 && input < 1000) {
            if (input % 2 == 0) {
                bonusPoints = (input * 0.2) + 1;
            } else if (input % 10 == 5) {
                bonusPoints = (input * 0.2) + 2;
            } else {
                bonusPoints = input * 0.2;
            }
        } else if (input > 1000) {
            if (input % 2 == 0) {
                bonusPoints = (input * 0.1) + 1;
            } else if (input % 10 == 5) {
                bonusPoints = (input * 0.1) + 2;
            } else {
                bonusPoints = input * 0.1;
            }
        }
        double result = input + bonusPoints;
        System.out.printf("Бонус точки: %.1f%n", bonusPoints);
        System.out.printf("Краен брой точки: %.1f", result);
    }
}