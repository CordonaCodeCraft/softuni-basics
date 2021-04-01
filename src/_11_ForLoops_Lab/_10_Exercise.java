/*
Да се напише програма, която чете n-на брой цели числа, подадени от потребителя,
и проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.
При равенство да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата;
Иначе да се отпечата "No" и на нов ред "Diff = " + разликата.
Разликата се изчислява по абсолютна стойност.
 */

// Judge ready
package _11_ForLoops_Lab;

import java.util.Scanner;

public class _10_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи брой цикли: ");
        int n = s.nextInt();
        int input = 0;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
//            System.out.printf("Въведи %d число: ", i);
            input = s.nextInt();
            if (i % 2 == 0) {
                sumEven += +input;
            } else {
                sumOdd += +input;
            }
        }
        boolean isEqual = sumEven == sumOdd;
        if (isEqual) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumEven-sumOdd));
        }
    }
}

