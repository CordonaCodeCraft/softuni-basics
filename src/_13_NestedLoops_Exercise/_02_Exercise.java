/*
Напишете програма, която чете от конзолата две шестцифрени цели числа в диапазона от 100000 до 300000.
Винаги първото въведено число ще бъде по малко от второто.
На конзолата да се отпечатат на 1 ред разделени с интервал всички числа, които се намират между двете, прочетени от конзолата числа и отговарят на следното условие:
Сумата от цифрите на четни и нечетни позиции да са равни. Ако няма числа, отговарящи на условието на конзолата не се извежда резултат.
 */

// TODO: 19.03.2020 г. Result identical, but printing not identical.


package _13_NestedLoops_Exercise;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, i, k, f, sumEven, sumOdd;
        sumEven = 0;
        sumOdd = 0;
//        System.out.print("Въведи първо число: ");
        a = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи второ число: ");
        b = Integer.parseInt(s.nextLine());
        for (i = a; i <= b; i++) {
            for (f = 0; f < 6; f++) {
                String integer = Integer.toString(i);
                k = Character.getNumericValue(integer.charAt(f));
                if (f % 2 == 0) {
                    sumEven += k;
                } else {
                    sumOdd += k;
                }
            }
            if (sumEven == sumOdd) {
                System.out.println(i + " ");
            }
            sumEven = 0;
            sumOdd = 0;
        }

    }
}



