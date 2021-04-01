/*
Дадени са n-на брой цели числа в интервала [1…1000].
От тях някакъв процент p1 се делят без остатък на 2, друг процент p2 се делят без остатък на 3, друг процент p3 се делят без остатък на 4.
Да се напише програма, която изчислява и отпечатва процентите p1, p2 и p3.
 */

// Judge ready

package _11_ForLoops__Exercises;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        int count, i, input;
        double p1, p2, p3;
        Scanner s = new Scanner(System.in);
        //System.out.print("Въведи брой числа за сравнение: ");
        count = s.nextInt();
        p1 = 0;
        p2 = 0;
        p3 = 0;
        for (i = 1; i <= count; i++) {
            //System.out.printf("Въведи %d число: ", i);
            input = s.nextInt();
            if (input % 2 == 0) {
                p1++;
            }
            if (input % 3 == 0) {
                p2++;
            }
            if (input % 4 == 0) {
                p3++;
            }
        }
        System.out.printf("%.2f%%%n",p1/count*100);
        System.out.printf("%.2f%%%n",p2/count*100);
        System.out.printf("%.2f%%%n",p3/count*100);
    }
}
