/*
Напишете програма, която чете цяло положително число n, въведено от потребителя, и печата числата от n до 1 в обратен ред (от най-голямото към най-малкото).
 */

// Judge ready

package _11_ForLoops_Lab;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
