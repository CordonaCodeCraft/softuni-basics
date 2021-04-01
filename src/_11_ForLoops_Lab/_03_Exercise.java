/*
Напишете програма, която чете число n, въведено от потребителя, и отпечатва числата от 1 до n през 3 (със стъпка 3).
 */

// Judge ready

package _11_ForLoops_Lab;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}
