/*
Лято е с много променливо време и Виктор има нужда от вашата помощ.
Напишете програма която спрямо времето от денонощието и градусите да препоръча на Виктор какви дрехи да си облече.
Вашия приятел има различни планове за всеки етап от деня, които изискват и различен външен вид, тях може да видите от таблицата.
 */
package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        String shoes, outfit, time;
        shoes = "";
        outfit = "";
        Scanner s = new Scanner(System.in);
        // Prompt user to enter initial parameters
        System.out.print("Въведи градуси: ");
        int temperature = Integer.parseInt(s.nextLine());
        System.out.print("Въведи време от денонощието 1) Мorning 2) Afternoon 3) Evening: ");
        time = s.nextLine();
        switch (time) {
            case "Morning":
                if (10 <= temperature && temperature <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (18 < temperature && temperature <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } break;
            case "Afternoon":
                if (10 <= temperature && temperature <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (18 < temperature && temperature <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (temperature >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                } break;
            case "Evening":
                if (10 <= temperature && temperature <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (18 < temperature && temperature <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit,shoes);
    }
}

