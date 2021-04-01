/*
Напишете програма, която изчислява колко решения в естествените числа (включително и нулата) има уравнението:
x1 + x2 + x3 = n
Числото n е цяло число и се въвежда от конзолата.

 */

// Judge ready

package _13_NestedLoops_Lab;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, x1, x2, x3, result, counter;
        counter = 0;
//        System.out.print("Въведи начало на интервала: ");
        n = Integer.parseInt(s.nextLine());
        for (x1 = 0; x1 <= n; x1++) {
            for (x2 = 0; x2 <= n; x2++) {
                for (x3 = 0; x3 <= n; x3++) {
                    result = x1 + x2 + x3;
                    if (result == n) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
