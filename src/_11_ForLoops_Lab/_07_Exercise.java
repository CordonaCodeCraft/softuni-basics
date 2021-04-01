/*
Да се напише програма, която чете n-на брой цели числа, въведени от потребителя и ги сумира.
•	От първия ред на входа се въвежда броят числа n.
•	От следващите n реда се въвежда по едно цяло число.
Програмата трябва да прочете числата, да ги сумира и да отпечата сумата им.
 */

// Judge ready

package _11_ForLoops_Lab;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи брой операции: ");
        int n = s.nextInt();
        int a = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
//            System.out.printf("Въведи %d число: ", i);
            a = s.nextInt();
            sum = a + sum;
        }
        System.out.println(sum);
    }
}
