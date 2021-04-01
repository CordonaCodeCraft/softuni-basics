/*
Лили вече е на N години. За всеки свой рожден ден тя получава подарък.
За нечетните рождени дни (1, 3, 5...n) получава играчки, а за всеки четен (2, 4, 6...n) получава пари.
За втория рожден ден получава 10.00 лв, като сумата се увеличава с 10.00 лв., за всеки следващ четен рожден ден (2 -> 10, 4 -> 20, 6 -> 30...и т.н.).
През годините Лили тайно е спестявала парите.
Братът на Лили, в годините, които тя получава пари, взима по 1.00 лев от тях.
Лили продала играчките получени през годините, всяка за P лева и добавила сумата към спестените пари.
С парите искала да си купи пералня за X лева.
Напишете програма, която да пресмята, колко пари е събрала и дали ѝ стигат да си купи пералня.
 */

// Judge ready

package _11_ForLoops_Lab;

import java.util.Scanner;

public class _11_Exercise {
    public static void main(String[] args) {
        int age, toyPrice, money, moneyTotal, toysTotal, totalSavings;
        double laundryPrice;
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи възраст: ");
        age = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи цена на пералня: ");
        laundryPrice = Double.parseDouble(s.nextLine());
//        System.out.print("Въведи цена на играчка: ");
        toyPrice = Integer.parseInt(s.nextLine());
        money = 0;
        moneyTotal = 0;
        toysTotal = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                moneyTotal = moneyTotal + (money - 1);
            } else {
                toysTotal = toysTotal + toyPrice;
            }
        }
        totalSavings = moneyTotal + toysTotal;
        boolean inBudget = laundryPrice <= totalSavings;
        if (inBudget) {
            System.out.printf("Yes! %.02f", Math.abs(laundryPrice-totalSavings));
        } else
            System.out.printf("No! %.02f", laundryPrice-totalSavings);
    }
}
