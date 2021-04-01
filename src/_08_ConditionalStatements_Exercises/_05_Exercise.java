/*
Да се напише програма, която чете час и минути от 24-часово денонощие,
въведени от потребителя и изчислява колко ще е часът след 15 минути.
Резултатът да се отпечата във формат часове:минути.
Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
Часовете се изписват с една или две цифри.
Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.
 */

package _08_ConditionalStatements_Exercises;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Promt user to enter initial parameters
        int hours, minutes, minutesPlus, minutesFinal;
        System.out.print("Въведи час: ");
        hours = Integer.parseInt(s.nextLine());
        System.out.print("Въведи минути: ");
        minutes = Integer.parseInt(s.nextLine());
        System.out.print("Добави минути: ");
        minutesPlus = Integer.parseInt(s.nextLine());
        minutesFinal = (minutes + minutesPlus);

        if (minutesFinal > 60 && hours == 23) {
            hours = 0;
            minutesFinal = minutesFinal-60;
        } else if (minutesFinal > 60 && hours != 23) {
            hours++;
            minutesFinal -= 60;
        }
        System.out.printf("%d:%02d", hours, minutesFinal);
    }
}
