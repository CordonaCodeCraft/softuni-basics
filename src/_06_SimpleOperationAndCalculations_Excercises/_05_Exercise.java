/*
Група танцьори си търсят нова зала.  Залата, която са харесали, е правоъгълна и има размери: L - дължина и W - ширина (в метри).
В залата има квадратен гардероб със страна - A и правоъгълна скамейка с площ 10 пъти по-малка от площта на залата.
Мястото, което заема един танцьор е 40 см² и допълнително за свободно движение му трябват още 7000см².
Напишете програма, която да изчислява колко танцьори могат да се поберат в залата и да се движат свободно.
Полученият резултат трябва да се закръгли до най-близкото цяло число надолу.
 */

package _06_SimpleOperationAndCalculations_Excercises;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Prompt user to enter initial parameters
        System.out.print("Въведете дължина на залата в метри: ");
        double l = Double.parseDouble(s.nextLine());
        System.out.print("Въведете ширина на залата в метри: ");
        double w = Double.parseDouble(s.nextLine());
        System.out.print("Въведете страна на гардероба в метри: ");
        double a = Double.parseDouble(s.nextLine());
        // Formulas
        double roomSize = (l * 100) * (w * 100);
        double wardrobeFace = (a * 100) * (a * 100);
        double benchSize = roomSize / 10;
        double availableSpace = roomSize-wardrobeFace-benchSize;
        double availableDancers = Math.floor(availableSpace/7040);
        System.out.printf("В залата могат да танцуват общо %.0f танцори",availableDancers);

    }
}
