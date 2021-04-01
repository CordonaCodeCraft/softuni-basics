/*
В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони.
Има три вида прожекции с билети на различни цени:
•	Premiere – премиерна прожекция, на цена 12.00 лева.
•	Normal – стандартна прожекция, на цена 7.50 лева.
•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
Напишете програма, която чете тип прожекция (стринг),
брой редове и брой колони в залата (цели числа), въведени от потребителя,
и изчислява общите приходи от билети при пълна зала.
Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.
 */
package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        double premiere, normal, discount, profit;
        int lines, columns, totalSeats;
        // Pricing
        premiere = 12;
        normal = 7.50;
        discount = 5;
        Scanner s = new Scanner(System.in);
        // Promt user to enter initial data
        System.out.print("Въведи тип прожекция: 1) Premiere 2) Normal 3) Discount: ");
        String type = s.nextLine();
        System.out.print("Въведи брой редове: ");
        lines = s.nextInt();
        System.out.print("Въведи брой колони: ");
        columns = s.nextInt();
        totalSeats = lines * columns;
        profit = 0;
        switch (type) {
            case "Premiere":
                profit = totalSeats * premiere;
                break;
            case "Normal":
                profit = totalSeats * normal;
                break;
            case "Discount":
                profit = totalSeats * discount;
                break;
            default:
                System.out.println("Няма такава прожекция.");
        }
        System.out.printf("%.2f leva", profit);
    }
}
