/*
Марин и Нели си купуват къща не далеч от София.
Нели толкова много обича цветята, че Ви убеждава да напишете програма която да изчисли колко  ще им струва,
да си засадят определен брой цветя и дали наличния бюджет ще им е достатъчен.
Различните цветя са с различни цени.
 */
package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String flowerType;
        // Pricing of the flowers
        double rosePrice = 5.0;
        double dahliaPrice = 3.80;
        double tulipPrice = 2.80;
        double narcissusPrice = 3.0;
        double gladiolusPrice = 2.50;
        // Prompt user to enter initial parameters
        System.out.print("Избери вид цвeте: 1) Roses 2) Dahlias 3) Tulips 4) Narcissus 5) Gladiolus: ");
        flowerType = s.nextLine();
        System.out.print("Въведи брой цветя: ");
        int flowersOrder = Integer.parseInt(s.nextLine());
        System.out.print("Въведи бюджет: ");
        int budget = Integer.parseInt(s.nextLine());
        double flowersTotalPrice = 0;
        switch (flowerType) {
            case "Roses":
                if (flowersOrder < 80) {
                    flowersTotalPrice = flowersOrder * rosePrice;
                } else {
                    flowersTotalPrice = flowersOrder * (rosePrice * 0.9);
                }
                break;
            case "Dahlias":
                if (flowersOrder < 80) {
                    flowersTotalPrice = flowersOrder * dahliaPrice;
                } else {
                    flowersTotalPrice = flowersOrder * (dahliaPrice * 0.85);
                }
                break;
            case "Tulips":
                if (flowersOrder < 80) {
                    flowersTotalPrice = flowersOrder * tulipPrice;
                } else {
                    flowersTotalPrice = flowersOrder * (tulipPrice * 0.85);
                }
                break;
            case "Narcissus":
                if (flowersOrder < 120) {
                    flowersTotalPrice = flowersOrder * (narcissusPrice + (narcissusPrice * 0.15));
                } else {
                    flowersTotalPrice = flowersOrder * narcissusPrice;
                }
                break;
            case "Gladiolus":
                if (flowersOrder < 80) {
                    flowersTotalPrice = flowersOrder * (gladiolusPrice + (gladiolusPrice * 0.20));
                } else {
                    flowersTotalPrice = flowersOrder * gladiolusPrice;
                }
                break;
        }
        boolean inBudget = budget >= flowersTotalPrice;
        if (inBudget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersOrder, flowerType, budget - flowersTotalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", flowersTotalPrice-budget);
        }
    }
}
