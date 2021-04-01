/*
Странно, но повечето хора си плануват от рано почивката.
Млад програмист разполага с определен бюджет и свободно време в даден сезон.
Напишете програма, която да приема на входа бюджета и сезона, а на изхода да изкарва, къде ще почива програмиста и колко ще похарчи.
Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи.
Ако е лято ще почива на къмпинг, а зимата в хотел. Ако е в Европа, независимо от сезона ще почива в хотел.
Всеки къмпинг или хотел, според дестинацията, има собствена цена която отговаря на даден процент от бюджета:
•	При 100лв. или по-малко – някъде в България
o	Лято – 30% от бюджета
o	Зима – 70% от бюджета
•	При 1000лв. или по малко – някъде на Балканите
o	Лято – 40% от бюджета
o	Зима – 80% от бюджета
•	При повече от 1000лв. – някъде из Европа
o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.
 */

package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String season, destination, accommodation;
        double budget, spentMoney;
        // Prompt user to enter initial parameters
        System.out.print("Въведи бюджет: ");
        budget = Double.parseDouble(s.nextLine());
        System.out.print("Избери сезон: 1) summer ; 2) winter: ");
        season = s.nextLine();
        destination = "";
        accommodation = "";
        if ((budget <= 100)) {
            destination = "Bulgaria";
        } else {
            destination = budget <= 1000 ? "Balkans" : "Europe";
        }
        spentMoney = destination.equals("Europe") ? budget * 0.90 : 0;
        switch (season) {
            case "summer":
                accommodation = destination.equals("Europe") ? "Hotel" : "Camp";
                switch (destination) {
                    case "Bulgaria":
                        spentMoney = budget * 0.30;
                        break;
                    case "Balkans":
                        spentMoney = budget * 0.40;
                        break;
                }
                break;
            case "winter":
                accommodation = "Hotel";
                switch (destination) {
                    case "Bulgaria":
                        spentMoney = budget * 0.70;
                        break;
                    case "Balkans":
                        spentMoney = budget * 0.80;
                        break;
                }
                break;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accommodation, spentMoney);
    }
}
