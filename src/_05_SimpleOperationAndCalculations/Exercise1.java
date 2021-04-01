package _05_SimpleOperationAndCalculations;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int l, w, h;
        Scanner s = new Scanner(System.in);
        // Prompt user ot enter the dimensions of the aquarium
        System.out.print("Въведи стойност за дължина в сантиметри: ");
        l = Integer.parseInt(s.nextLine());
        System.out.print("Въведи стойност за широчина в сантиметри: ");
        w = Integer.parseInt(s.nextLine());
        System.out.print("Въведи стойност за височина в сантиметри: ");
        h = Integer.parseInt(s.nextLine());
        System.out.print("Въведи процент за заетост: ");
        double content = Double.parseDouble(s.nextLine());
        // Formula to calculate the volume
        double liters = (l * w * h) / 1000.0;
        // Formula to calculate the occupied water
        double occupied = (liters * content) / 100;
        // Formula to calculate the available water
        double available = liters - occupied;
        System.out.printf("Аквариумът може да събере %.3f литра вода",available );
    }
}
