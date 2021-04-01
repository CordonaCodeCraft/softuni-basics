/*
Правоъгълник е зададен с координатите на два от своите срещуположни ъгъла (x1, y1)  и (x2, y2).
Да се пресметнат площта (лицето) и периметърът му.
Входът се чете от конзолата.
Числата x1, y1, x2 и y2 са дадени по едно на ред.
Изходът се извежда на конзолата и трябва да съдържа два реда с по едно число на всеки от тях – лицето и периметърът
 */

package _06_SimpleOperationAndCalculations_Excercises;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Prompt user to enter coordinates
        System.out.print("Въведи стойност за \"x1\" : ");
        double x1 = Double.parseDouble(s.nextLine());
        System.out.print("Въведи стойност за \"y1\" : ");
        double y1 = Double.parseDouble(s.nextLine());
        System.out.print("Въведи стойност за \"x2\" : ");
        double x2 = Double.parseDouble(s.nextLine());
        System.out.print("Въведи стойност за \"y2\" : ");
        double y2 = Double.parseDouble(s.nextLine());
        //Formulas to calculate length and width
        double length = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);
        //Formulas to calculate face and perimeter
        double face = length * width;
        double perimeter = (length + width) * 2;
        System.out.printf("Лицето на правоъгълника е %.2f%n", face);
        System.out.printf("Периметърът на правоъгълника е %.2f", perimeter);


    }
}
