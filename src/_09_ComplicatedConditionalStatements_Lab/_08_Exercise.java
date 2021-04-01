package _09_ComplicatedConditionalStatements_Lab;

import java.util.Scanner;

public class _08_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи ден от седмицата: ");
        String day = s.nextLine();
        System.out.print("Въведи артикул: ");
        String product = s.nextLine();
        System.out.print("Въведи количество: ");
        double quantity = Double.parseDouble(s.nextLine());
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (product) {
                    case "banana":
                        System.out.printf("The price is %.2f leva", quantity * 2.50);
                        break;
                    case "apple":
                        System.out.printf("The price is %.2f leva", quantity * 1.20);
                        break;
                    case "orange":
                        System.out.printf("The price is %.2f leva", quantity * 0.85);
                        break;
                    case "grapefruit":
                        System.out.printf("The price is %.2f leva", quantity * 1.45);
                        break;
                    case "kiwi":
                        System.out.printf("The price is %.2f leva", quantity * 2.70);
                        break;
                    case "pineapple":
                        System.out.printf("The price is %.2f leva", quantity * 5.50);
                        break;
                    case "grapes":
                        System.out.printf("The price is %.2f leva", quantity * 3.85);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (product) {
                    case "banana":
                        System.out.printf("The price is %.2f leva", quantity * 2.70);
                        break;
                    case "apple":
                        System.out.printf("The price is %.2f leva", quantity * 1.25);
                        break;
                    case "orange":
                        System.out.printf("The price is %.2f leva", quantity * 0.90);
                        break;
                    case "grapefruit":
                        System.out.printf("The price is %.2f leva", quantity * 1.60);
                        break;
                    case "kiwi":
                        System.out.printf("The price is %.2f leva", quantity * 3.00);
                        break;
                    case "pineapple":
                        System.out.printf("The price is %.2f leva", quantity * 5.60);
                        break;
                    case "grapes":
                        System.out.printf("The price is %.2f leva", quantity * 4.20);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
