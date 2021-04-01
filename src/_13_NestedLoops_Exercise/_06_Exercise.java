/*
Да се напише програма, която чете едно цяло число N, въведено от потребителя, и генерира всички възможни "специални" числа от 1111 до 9999. За да бъде "специално" едно число, то трябва да отговаря на следното условие:
•	N да се дели на всяка една от неговите цифри без остатък.
 */

// Judge ready

package _13_NestedLoops_Exercise;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи стойност за \"n\": ");
        int n, i, j, k;
        String integer;
        n = Integer.parseInt(s.nextLine());
        for (i = 1111; i <= 9999; i++) {
            int counter = 0;
            integer = Integer.toString(i);
            for (j = 0; j <= 3; j++) {
                k = Character.getNumericValue(integer.charAt(j));
                if (k == 0) {
                    continue;
                }
                if (n % k == 0) {
                    counter++;
                }
                if (counter == 4) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
