/*
Дадени са n цели числа в интервала [1…1000].
От тях някакъв процент p1 са под 200, друг процент p2 са от 200 до 399, друг процент p3 са от 400 до 599, друг процент p4 са от 600 до 799 и останалите p5 процента са от 800 нагоре.
Да се напише програма, която изчислява и отпечатва процентите p1, p2, p3, p4 и p5.
 */

// Judge ready

package _11_ForLoops__Exercises;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        int n, i, input;
        double p1, p2, p3, p4, p5;
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведете брой числа за сравнение: ");
        n = s.nextInt();
        p1 = 0;
        p2 = 0;
        p3 = 0;
        p4 = 0;
        p5 = 0;
        for (i = 1; i <= n; i++) {
//            System.out.printf("Въведете %d число: ", i);
            input = s.nextInt();
            if (input < 200) {
                p1++;
            } else if (input >= 200 && input <= 399) {
                p2++;
            } else if (input >= 400 & input <= 599) {
                p3++;
            } else if (input >= 600 & input <= 799) {
                p4++;
            } else if (input >= 800) {
                p5++;
            }
        }
        System.out.printf("%.2f%%%n",p1/n*100);
        System.out.printf("%.2f%%%n",p2/n*100);
        System.out.printf("%.2f%%%n",p3/n*100);
        System.out.printf("%.2f%%%n",p4/n*100);
        System.out.printf("%.2f%%%n",p5/n*100);


    }
}
