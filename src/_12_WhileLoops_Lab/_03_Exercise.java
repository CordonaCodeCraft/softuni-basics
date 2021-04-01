/*
Напишете програма, която чете цели числа, докато не получи командата "Stop".
След приключване на четенето да се отпечата сумата на всички въведени числа.
 */

// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
//        System.out.print("Въведи число: ");
        String input = s.nextLine();
        while (!input.equals("Stop")) {
            int integer = Integer.parseInt(input);
            sum += integer;
//            System.out.print("Въведи число: ");
            input = s.nextLine();
        }
        System.out.println(sum);
    }
}

