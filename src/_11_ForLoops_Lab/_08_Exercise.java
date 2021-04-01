/*
Напишете програма, която чете n на брой цели числа. Принтирайте най-голямото и най-малкото число сред въведените.
 */

// Judge ready

package _11_ForLoops_Lab;

import java.util.Scanner;

public class _08_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (i = 1; i <= n; i++) {
            int num = s.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}

