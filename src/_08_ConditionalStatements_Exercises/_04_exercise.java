// Да се напише програма, която преобразува разстояние между следните 3 мерни единици: mm, cm, m.

package _08_ConditionalStatements_Exercises;

import java.util.Scanner;

public class _04_exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Prompt user to enter initial parameters
        System.out.print("Въведи число: ");
        double number = Double.parseDouble(s.nextLine());
        System.out.print("Въведи входна мерна единица в \"m\", \"cm\" или \"mm\": ");
        String input = s.nextLine();
        System.out.print("Въведи изходна мерна единица в \"m\", \"cm\" или \"mm\": ");
        String output = s.nextLine();
        double result = 0;
        if (input.equals("m")) {
            if (output.equals("cm")) {
                result = number * 100;
            } else if (output.equals("mm")) {
                result = number * 1000;
            }
        } else if (input.equals("cm")) {
            if (output.equals("m")) {
                result = number / 100;
            } else if (output.equals("mm")) {
                result = number * 10;
            }
        } else if (input.equals("mm")) {
            if (output.equals("cm")) {
                result = number/10;
            } else if (output.equals("m")) {
                result = number/1000;
            }
        }
        System.out.printf("%.2f %s са %.3f %s", number,input, result, output);
    }

}
