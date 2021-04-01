package _07_ConditionalStatements_Lab;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Избери вид фигура: \"square\", \"rectangle\", \"circle\" или \"triangle\": ");
        String input = s.nextLine();
        if (input.equals("square")) {
            System.out.println("Въведи страна на квадрата: ");
            double squareSide = Double.parseDouble(s.nextLine());
            double squareFace = squareSide * squareSide;
            System.out.printf("Лицето на квадрата е: %.3f", squareFace);
        } else if (input.equals("rectangle")) {
            System.out.println("Въведи страни на правоъгълника: ");
            double a = Double.parseDouble(s.nextLine());
            double b = Double.parseDouble(s.nextLine());
            double rectangleFace = a * b;
            System.out.printf("Лицето на правоъгълника е: %.3f", rectangleFace);
        } else if (input.equals("circle")) {
            System.out.println("Въведи радиус на окръжност: ");
            double r = Double.parseDouble(s.nextLine());
            double circleFace = Math.PI * (r*r);
            System.out.printf("Лицето на окръжността е: %.3f", circleFace);
        } else if (input.equals("triangle")) {
            System.out.println("Въведи страни на равнобедрения триъгълник: ");
            double a = Double.parseDouble(s.nextLine());
            double b = Double.parseDouble(s.nextLine());
            double triangleFace = (a * b)/2;
            System.out.printf("Лицето на равнобедрения триъгълник е: %.3f", triangleFace);
        }
    }
}
