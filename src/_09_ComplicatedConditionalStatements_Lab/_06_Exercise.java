package _09_ComplicatedConditionalStatements_Lab;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи продукт: ");
        String input = s.nextLine();
        boolean isFruit = input.equals("banana")
                || input.equals("apple")
                || input.equals("kiwi")
                || input.equals("cherry")
                || input.equals("lemon")
                || input.equals("grapes");
        boolean isVegetable = input.equals("tomato")
                || input.equals("cucumber")
                || input.equals("pepper")
                || input.equals("carrot");
        if (isFruit) {
            System.out.println("fruit");
        } else if (isVegetable) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");

        }

    }
}