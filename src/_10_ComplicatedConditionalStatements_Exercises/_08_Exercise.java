/*
Хотел предлага 2 вида стаи: студио и апартамент.
Напишете програма, която изчислява цената за целия престой за студио и апартамент.
 */

package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _08_Exercise {
    public static void main(String[] args) {
        double studioPrice, apartmentPrice, totalPrice, discountPrice;
        int days;
        Scanner s = new Scanner(System.in);
        System.out.print("Избери месец: 1) May 2) June 3) July 4) August 5) September 6) October: ");
        String month = s.nextLine();
        System.out.print("Въведи брой нощувки: ");
        days = Integer.parseInt(s.nextLine());
        studioPrice = 76 * days;
        apartmentPrice = 77 * days;
        switch (month) {
            case "May":
            case "October":
                studioPrice = 50 * days;
                apartmentPrice = 65 * days;
                if (days > 7 && days <= 14) {
                    studioPrice *= 0.95;
                } else if (days > 14) {
                    studioPrice *= 0.70;
                    apartmentPrice *= 0.90;
                }
                break;
            case "June":
            case "September":
                studioPrice = days > 14 ? (75.20 * 0.80) * days : 75.20 * days;
                apartmentPrice = days > 14 ? (68.70 * 0.90) * days : 68.70 * days;
        }
        System.out.printf("Apartment: %.2f lv.", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
