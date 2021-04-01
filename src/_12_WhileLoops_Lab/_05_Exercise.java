/*
Напишете програма, която пресмята колко общо пари има в сметката, след като направите определен брой вноски.
На първия ред ще получите колко вноски трябва да се направят.
На всеки следващ ред ще получавате сумата, която трябва да внесете в сметката, докато не се достигне броя вноски.
При всяка получена сума на конзолата трябва да се извежда "Increase: " + сумата и тя да се прибавя в сметката.
Ако получите число по-малко от 0 на конзолата трябва да се изведе "Invalid operation!" и програмата да приключи.
Когато програмата приключи трябва да се принтира "Total: " + общата сума в сметката закръглена до втория знак след десетичната запетая.
 */
//        System.out.printf("Въведи %d вноскa: ", count);
//        System.out.print("Въведи брой вноски: ");
//        System.out.printf("Въведи %d вноскa: ", count);

// Judge ready

// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalInstalments, counter;
        double instalment, balance;
        totalInstalments = Integer.parseInt(s.nextLine());
        counter = 0;
        balance = 0;
        while (counter < totalInstalments) {
            instalment = Double.parseDouble(s.nextLine());
            if (instalment < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            balance = balance + instalment;
            System.out.printf("Increase: %.2f%n",instalment);
            counter++;
        }
        System.out.printf("Total: %.2f", balance);
    }
}
