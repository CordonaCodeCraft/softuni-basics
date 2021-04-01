/*
Напишете програма, която чете текст от конзолата(стринг), докато не получи командата "Stop".
 */

// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        while (!input.equals("Stop")) {
            System.out.println("Въведи текст: ");
            input = s.nextLine();
        }
    }
}
