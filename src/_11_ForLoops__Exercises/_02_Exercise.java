/*
Да се напише програма, която чете n-на брой цели числа, въведени от потребителя,
и проверява дали сред тях съществува число, което е равно на сумата на всички останали.
Ако има такъв елемент, печата "Yes", "Sum = "  + неговата стойност;
иначе печата "No", "Diff = " + разликата между най-големия елемент и сумата на останалите (по абсолютна стойност).
*/

// Judge ready

package _11_ForLoops__Exercises;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        int count, input, sum, min, max, remainder;
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи брой числа за сравнение: ");
        count = s.nextInt();
        input = 0;
        sum = 0;
        max = Integer.MIN_VALUE;
        for (int i = 1; i <= count; i++) {
//            System.out.print("Въведи число: ");
            input = s.nextInt();
            sum = sum + input;
            if (input > max) {
                max = input;
            }
        }
        remainder = sum - max;

        if (max == remainder) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max - remainder));
        }
    }
}
