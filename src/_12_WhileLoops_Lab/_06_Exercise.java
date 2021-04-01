/*
Напишете програма, която чете n-на брой цели числа (n > 0), въведени от потребителя, и намира най-голямото измежду тях.
Първо се въвежда броят числа n, а след това самите n числа, по едно на ред.
 */

// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, counter, input, max;
//        System.out.print("Въведете брой числа за сравнение: ");
        n = s.nextInt();
        counter = 1;
        max = Integer.MIN_VALUE;
        while (counter <= n) {
//            System.out.printf("Въведете %d число: ", counter);
            input = s.nextInt();
            if (input > max) {
                max = input;
            }
            counter++;
        }
        System.out.print(max);
    }
}
