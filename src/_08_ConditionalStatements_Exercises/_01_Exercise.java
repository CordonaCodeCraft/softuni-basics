/*
Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50).
Да се напише програма, която чете времената на състезателите в секунди, въведени от потребителя и пресмята сумарното им време във формат "минути:секунди".
Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").
 */
package _08_ConditionalStatements_Exercises;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Prompt the user to enter initial parameters
        System.out.print("Въведи времето в секунди за първия състезател:");
        int r1 = Integer.parseInt(s.nextLine());
        System.out.print("Въведи времето в секунди за втория състезател:");
        int r2 = Integer.parseInt(s.nextLine());
        System.out.print("Въведи времето в секунди за третия състезател:");
        int r3 = Integer.parseInt(s.nextLine());
        int totalTime = r1 + r2 + r3;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;
        if (totalTime < 60) {
            System.out.printf("Общото време е 0:%d секунди", seconds);
        } else if (totalTime > 60 && seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        }
        else {
            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}




