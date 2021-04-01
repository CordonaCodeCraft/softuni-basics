/*
Напишете програма, която чете текст(стринг), въведен от потребителя и печата всеки символ от текста на отделен ред.
 */

// Judge ready

package _11_ForLoops_Lab;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
}
