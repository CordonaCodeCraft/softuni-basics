package _05_SimpleOperationAndCalculations;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double i = Double.parseDouble(s.nextLine());
        double centimeters = i * 2.54;
        System.out.printf("%.2f инча са %.2f сантиметра",i,centimeters);

    }
}

