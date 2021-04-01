package _09_ComplicatedConditionalStatements_Lab;

import java.util.Scanner;

public class _10_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Rooms pricing
        int singlePrice = 18;
        int apartmentPrice = 25;
        int presidentPrice = 35;
        // Temporary variables
        int nights = 0;
        double regularPrice = 0;
        double discountPrice = 0;
        // Prompt user to enter initial parameters
        System.out.print("Въведи брой дни на престой: ");
        int days = Integer.parseInt(s.nextLine());
        System.out.print("Въведи стая 1) room for one person ; 2) apartment ; 3) president apartment: ");
        String roomType = s.nextLine();
        System.out.print("Дай оценка 1) positive или 2) negative: ");
        String feedBack = s.nextLine();
        // Formula to calculate number of nights
        if (days == 1) {
            nights = 1;
        } else {
            nights = days - 1;
        }
        // Formulas to calculate concrete discounts per room time
        switch (roomType) {
            case "room for one person":
                discountPrice = nights * singlePrice;
                break;
            case "apartment":
                regularPrice = nights * apartmentPrice;
                if (days < 10) {
                    discountPrice = regularPrice * 0.70;
                } else if (days >= 10 && days <= 15) {
                    discountPrice = regularPrice * 0.65;
                } else if (days > 15) {
                    discountPrice = regularPrice * 0.50;
                }
                break;
            case "president apartment":
                regularPrice = nights * presidentPrice;
                if (days < 10) {
                    discountPrice = regularPrice * 0.90;
                } else if (days >= 10 && days <= 15) {
                    discountPrice = regularPrice * 0.85;

                } else if (days > 15) {
                    discountPrice = regularPrice * 0.80;
                }
                break;
            default:
                System.out.println("Не предлагаме такъв апартемант");
        }
        if (feedBack.equals("positive")) {
            System.out.printf("Крайната цена е %.2f", discountPrice += discountPrice * 0.25);

        } else {
            System.out.printf("Крайната цена е %.2f", discountPrice - (discountPrice * 0.10));
        }
    }
}
