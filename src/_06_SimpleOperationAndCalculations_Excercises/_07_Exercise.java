/*
Георги решава да направи купон и отива до алкохолната борса за да купи бира, вино, ракия и уиски.
На конзолата се въвежда цената на уискито в лв./л. и количеството на бирата, виното, ракията и уискито, които трябва да закупи.
Да се напише програма, която пресмята колко пари са му необходими, за да плати сметката, като знаете, че:

•	цената на ракията е с 50% по-ниска от тази на уискито;
•	цената на виното е с 40% по-ниска от цената на ракията;
•	цената на бирата е с 80% по-ниска от цената на ракията.

 */

package _06_SimpleOperationAndCalculations_Excercises;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Prompt user to enter initial parameters
        System.out.print("Въведи цена на уиски за литър: ");
        double wiskeyPrice = Double.parseDouble(s.nextLine());
        System.out.print("Въведи литри бира: ");
        double beerLiters = Double.parseDouble(s.nextLine());
        System.out.print("Въведи литри вино: ");
        double wineLiters = Double.parseDouble(s.nextLine());
        System.out.print("Въведи литри ракия: ");
        double rakiaLiters = Double.parseDouble(s.nextLine());
        System.out.print("Въведи литри уиски: ");
        double wiskeyLiters = Double.parseDouble(s.nextLine());
        // Formulas to calculate the pricing and the total
        double rakiaPrice = wiskeyPrice - (wiskeyPrice * 0.5);
        double winePrice = rakiaPrice - (rakiaPrice * 0.4);
        double beerPrice = rakiaPrice - (rakiaPrice * 0.8);
        double total = (wiskeyPrice * wiskeyLiters) + (rakiaPrice * rakiaLiters) + (winePrice * wineLiters) + (beerPrice * beerLiters);
        System.out.printf("Общата необходима сума е %.2f лева", total);

    }
}
