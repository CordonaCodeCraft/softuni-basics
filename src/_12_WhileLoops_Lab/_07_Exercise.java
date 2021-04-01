/*
Напишете програма, която чете n-на брой цели числа (n > 0), въведени от потребителя и намира най-малкото измежду тях.
Първо се въвежда броят числа n, а след това самите n числа, по едно на ред.
 */
// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, counter, input, min;
//        System.out.print("Въведете брой числа за сравнение: ");
        n = s.nextInt();
        counter = 1;
        min = Integer.MAX_VALUE;
        while (counter <= n) {
//            System.out.printf("Въведете %d число: ", counter);
            input = s.nextInt();
            if (input < min) {
                min = input;
            }
            counter++;
        }
        System.out.print(min);
    }
}
