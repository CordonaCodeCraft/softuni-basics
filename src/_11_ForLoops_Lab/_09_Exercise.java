/*
Да се напише програма, която чете 2*n-на брой цели числа, подадени от потребителя,
и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата.
Разликата се изчислява като положително число (по абсолютна стойност).
*/

// Judge ready

package _11_ForLoops_Lab;

import java.util.Scanner;

public class _09_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи брой цикли: ");
        int n = s.nextInt();
        int left_Digits = 0;
        int sumLeft = 0;
        int rightDigits = 0;
        int sumRight = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Въведи %d число за ляв сбор: ", i);
            left_Digits = s.nextInt();
            sumLeft += left_Digits;
            System.out.printf("Въведи %d число за десен сбор: ", i);
            rightDigits = s.nextInt();
            sumRight += rightDigits;
        }
        boolean isEqual = sumLeft == sumRight;
        if (isEqual) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }
    }
}