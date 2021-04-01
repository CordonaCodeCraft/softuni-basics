/*
Да се напише програма, която чете число n, въведено от потребителя, и печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n.
 */

// Judge ready
package _11_ForLoops_Lab;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = 0;
        int d = 2;
        int k = 0;
        for (t = 0; t <= n; t += 2) {
            k = (int) Math.pow(d,t);
            System.out.println(k);
        }
    }
}

