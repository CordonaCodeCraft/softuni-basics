package _09_ComplicatedConditionalStatements_Lab;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи град: ");
        String town = s.nextLine();
        System.out.print("Въведи продукт: ");
        String product = s.nextLine();
        System.out.print("Въведи количество: ");
        int quantity = Integer.parseInt(s.nextLine());
        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 0.50);
                        break;
                    case "water":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 0.80);
                        break;
                    case "beer":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 1.20);
                        break;
                    case "sweets":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 1.45);
                        break;
                    case "peanuts":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 1.60);
                        break;
                    default:
                        System.out.println("Въведохте липсващ артикул");
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 0.40);
                        break;
                    case "water":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 0.70);
                        break;
                    case "beer":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 1.15);
                        break;
                    case "sweets":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 1.30);
                        break;
                    case "peanuts":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 1.50);
                        break;
                    default:
                        System.out.println("Въведохте липсващ артикул");
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 0.45);
                        break;
                    case "water":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 0.70);
                        break;
                    case "beer":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 1.10);
                        break;
                    case "sweets":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 1.35);
                        break;
                    case "peanuts":
                        System.out.printf("The price for %d %s is %.2f leva", quantity, product, quantity * 1.55);
                        break;
                    default:
                        System.out.println("Въведохте липсващ артикул");
                }
                break;
        }
    }

}
