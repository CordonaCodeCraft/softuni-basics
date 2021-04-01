/*
Джеси е решила да събира пари за екскурзия и иска от вас да ѝ помогнете да разбере дали ще успее да събере необходимата сума.
Тя спестява или харчи част от парите си всеки ден.
Ако иска да похарчи повече от наличните си пари, то тя ще похарчи всичките и ще ѝ останат 0 лева.
 */

// TODO: 16.03.2020 г.  Judge not ready 88/100

package _12_WhileLoops_Exercises;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double target, cash, sum, totalSaved, totalSpent, result;
        int days, crazyDays;
        String action;
        days = 1;
        totalSaved = 0;
        totalSpent = 0;
        crazyDays = 0;
//        System.out.print("Въведи бюджет за екскурзията: ");
        target = Double.parseDouble(s.nextLine());
//        System.out.print("Въведи налична сума: ");
        cash = Double.parseDouble(s.nextLine());
        result = 0;
        while (days < Integer.MAX_VALUE) {
//            System.out.print("Избери \"spend\" или \"save\": ");
            action = s.nextLine();
//            System.out.print("Въведи сума: ");
            sum = Double.parseDouble(s.nextLine());
            switch (action) {
                case "spend":
                    totalSpent += sum;
                    crazyDays++;
                    break;
                case "save":
                    totalSaved += sum;
                    crazyDays = 0;
                    break;
            }
            result = (cash + totalSaved) - totalSpent;
            if (result >= target || totalSaved >= target) {
                System.out.printf("You saved the money for %d days.", days);
                break;
            }
            if (crazyDays == 5) {
                System.out.println("You can't save the money.");
                System.out.println(days);
                break;
            }
            days++;
        }
    }
}
