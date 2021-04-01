/*
Напишете програма, която чете число n, въведено от потребителя, и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, ….
Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.
 */

// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведете число: ");
        int n = s.nextInt();
        int result = 1;
        while (result <= n) {
            System.out.println(result);
            result = (result*2)+1;
        }
    }
}
