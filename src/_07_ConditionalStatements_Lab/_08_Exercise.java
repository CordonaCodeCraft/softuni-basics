/*
Петя има магазин за детски играчки. Тя получава голяма поръчка, която трябва да изпълни.
С парите, които ще спечели иска да отиде на екскурзия.
Да се напише програма, която пресмята печалбата от поръчката.
Цени на играчките:
•	Пъзел - 2.60 лв.
•	Говореща кукла - 3 лв.
•	Плюшено мече - 4.10 лв.
•	Миньон - 8.20 лв.
•	Камионче - 2 лв.
Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
От спечелените пари Петя трябва да даде 10% за наема на магазина.
Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.

 */
package _07_ConditionalStatements_Lab;

import java.util.Scanner;

public class _08_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Pricing
        double puzzlePrice = 2.60;
        int dollPrice = 3;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        int truckPrice = 2;
        // Prompt user to enter initial parameters
        System.out.print("Въведи цена на екскурзията: ");
        double tripPrice = Double.parseDouble(s.nextLine());
        System.out.print("Въведи брой поръчани пъзели: ");
        int puzzlesNo = Integer.parseInt(s.nextLine());
        System.out.print("Въведи брой поръчани говорещи кукли: ");
        int dollsNo = Integer.parseInt(s.nextLine());
        System.out.print("Въведи брой поръчани плюшени мечета: ");
        int bearsNo = Integer.parseInt(s.nextLine());
        System.out.print("Въведи брой поръчани миньони: ");
        int minionsNo = Integer.parseInt(s.nextLine());
        System.out.print("Въведи брой поръчани камиончета: ");
        int trucksNo = Integer.parseInt(s.nextLine());
        // Formula to calculate the total quantity of the ordered toys
        int totalToys = puzzlesNo + dollsNo + bearsNo + minionsNo + trucksNo;
        // Formula to calculate the total expense of the ordered toys BEFORE the discount
        double expense_Before_Discount = (puzzlePrice * puzzlesNo) + (dollPrice * dollsNo) + (bearPrice * bearsNo) + (minionPrice * minionsNo) + (truckPrice * trucksNo);
        // Formula to calculate the total expense of the ordered toys AFTER the discount
        double expense_After_Discount = expense_Before_Discount;
        if (totalToys >= 50) {
            expense_After_Discount = expense_Before_Discount * 0.75;
        }
        //Formula to calculate profit
        double profitAfterRent = expense_After_Discount - (expense_After_Discount * 0.10);

        if (profitAfterRent > tripPrice) {
            System.out.printf("Yes! %.2f lv left", profitAfterRent - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed!", tripPrice-profitAfterRent);
        }
    }
}
