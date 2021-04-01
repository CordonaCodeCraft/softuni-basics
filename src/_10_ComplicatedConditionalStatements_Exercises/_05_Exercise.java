/*
Тони и приятели много обичали да ходят за риба, те са толкова запалени по риболова, че решават да отидат на риболов с кораб.
Цената за наема на кораба зависи от сезона и броя рибари.
Цената зависи от сезона:
•	Цената за наем на кораба през пролетта е  3000 лв.
•	Цената за наем на кораба през лятото и есента е  4200 лв.
•	Цената за наем на кораба през зимата е  2600 лв.
В зависимост от броя си групата ползва отстъпка:
•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
•	Ако групата е от 12 нагоре  –  отстъпка от 25%.
Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.
 */
package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int budget, groupCount;
        double rent, lefOver;
        // Prompt user to enter initial parameters
        System.out.print("Въведи бюджет: ");
        budget = Integer.parseInt(s.nextLine());
        System.out.print("Въведи сезон: 1) Spring 2) Summer 3) Autumn 4) Winter: ");
        String season = s.nextLine();
        System.out.print("Въведи брой на групата: ");
        groupCount = Integer.parseInt(s.nextLine());
        rent = 0;
        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        if (groupCount % 2 == 0 && !season.equals("Autumn")) {
            if (groupCount <= 6) {
                rent *= 0.85;
            } else if (groupCount >= 7 && groupCount <= 11) {
                rent *= 0.80;
            } else if (groupCount > 12) {
                rent *= 0.70;
            }
        } else {
            if (groupCount <= 6) {
                rent *= 0.90;
            } else if (groupCount >= 7 && groupCount <= 11) {
                rent *= 0.85;
            } else if (groupCount > 12) {
                rent *= 0.75;
            }
        }
        lefOver = Math.abs(budget-rent);
        boolean inBudget = budget >= rent;
        if (inBudget) {
            System.out.printf("Yes! You have %.2f leva left.", lefOver);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", lefOver);
        }
    }
}
