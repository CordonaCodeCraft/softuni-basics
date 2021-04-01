/*
Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа.
На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число.
Ако няма нито една комбинация отговаряща на условието се отпечатва съобщение, че не е намерено.
 */

// Judge ready

package _13_NestedLoops_Lab;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        int start, end, magic, result, a, b, counter;
        boolean flag;
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи начало на интервала: ");
        start = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи край на интервала: ");
        end = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи магическо число: ");
        magic = Integer.parseInt(s.nextLine());
        result = 0;
        counter = 0;
        flag = false;

        for (a = start; a <= end; a++) {
            for (b = start; b <= end; b++) {
                counter++;
                result = a + b;
                if (result == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, a, b, result);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", counter, magic);
        }
    }
}

