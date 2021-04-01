/*
Напишете програма, която чете цяло число n, въведено от потребителя, и отпечатва пирамида от числа.
 */

// TODO: 18.03.2020 г. Judge not rady, exercise NOT clear !!!

package _13_NestedLoops_Exercise;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows, cols;
        System.out.print("Въведете стойност за \"n\"");
        int n = s.nextInt();
        boolean flag = false;
        int current = 1;
        for (rows = 1; rows <= n; rows++) {
            for (cols = 1; cols <= rows; cols++) {
                if (current > n) {
                    flag = true;
                    break;
                }
                System.out.println(current + "");
                current++;
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}

