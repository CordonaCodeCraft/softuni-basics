/*
Напишете програма, която проверява дали точка {x, y} се намира върху някоя от страните на правоъгълник {x1, y1} – {x2, y2}.
Входните данни се четат от конзолата и се състоят от 6 реда въведени от потребителя:
десетичните числа x1, y1, x2, y2, x и y (като се гарантира, че x1 < x2 и y1 < y2).
Да се отпечата "Border" (точката лежи на някоя от страните) или "Inside / Outside" (в противен случай).
 */

package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        int x1, x2, y1, y2, x, y;
        Scanner s = new Scanner(System.in);
        // Promt user to enter initial parameters
        System.out.print("Въведи стойност за \"x1\": ");
        x1 = s.nextInt();
        System.out.print("Въведи стойност за \"y1\": ");
        y1 = s.nextInt();
        System.out.print("Въведи стойност за \"x2\": ");
        x2 = s.nextInt();
        System.out.print("Въведи стойност за \"y2\": ");
        y2 = s.nextInt();
        System.out.print("Въведи стойност за \"x\": ");
        x = s.nextInt();
        System.out.print("Въведи стойност за \"y\": ");
        y = s.nextInt();
        // Flags to detect the point on each side of the rectangle
        boolean onSideAorB = (y == y1 || y == x2) && (x >= x1 && x <= x2);
        boolean onSideCorD = (x == x1 || x == x2) && (y >= y1 && y <= y2);
        // Result
        if (onSideAorB || onSideCorD) {
            System.out.print("Border");
        } else {
            System.out.println("Inside / Outside");
        }
        // Flags to detect the point on each side of the rectangle
//        boolean onSideA = (y == y2) && (x >= x1 && x <= x2);
//        boolean onSideB = (y == y1) && (x >= x1 && x <= x2);
//        boolean OnSideC = (x == x1) && (y >= y1 && y <= y2);
//        boolean OnSideD = (x == x2) && (y >= y1 && y <= y2);
//        if (onSideA) {
//            System.out.print("Border");
//        } else if (onSideB) {
//            System.out.print("Border");
//        } else if (OnSideC) {
//            System.out.print("Border");
//        } else if (OnSideD) {
//            System.out.print("Border");
//        } else {
//            System.out.println("Inside / Outside");


    }
}