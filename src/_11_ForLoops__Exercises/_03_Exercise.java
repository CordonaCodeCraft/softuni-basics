/*

Напишете програма, която чете n-на брой числа, въведени от потребителя, и пресмята сумата, минимума и максимума на числата на четни и нечетни позиции (броим от 1).
Когато няма минимален / максимален елемент, отпечатайте "No".

 */

// Judge ready

package _11_ForLoops__Exercises;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        int count, i;
        double input, evenMin, evenMax, evenSum, oddMin, oddMax, oddSum;
        Scanner s = new Scanner(System.in);
        //System.out.print("Въведете брой числа за сравнение: ");
        count = Integer.parseInt(s.nextLine());
        evenMin = 1000000000.0;
        evenMax = -1000000000.0;
        oddMin = 1000000000.0;
        oddMax = -1000000000.0;
        evenSum = 0;
        oddSum = 0;
        if (count == 0) {
            evenMin = 0;
            evenMax = 0;
            oddMin = 0;
            oddMax = 0;
        } else {
            for (i = 1; i <= count; i++) {
                //System.out.printf("Въведете %d реално число: ", i);
                input = Double.parseDouble(s.nextLine());
                if (i % 2 == 0) {
                    if (input < evenMin) {
                        evenMin = input;
                    }
                    if (input > evenMax) {
                        evenMax = input;
                    }
                    evenSum += input;

                } else {
                    if (input < oddMin) {
                        oddMin = input;
                    }
                    if (input > oddMax) {
                        oddMax = input;
                    }
                    oddSum += input;
                }
            }
        }
        if (evenSum == 0) {
            evenMax = 0;
            evenMin = 0;
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        System.out.printf(oddMin == 0 ? "OddMin=No, \n" : "OddMin=%.2f,%n", oddMin);
        System.out.printf(oddMax == 0 ? "OddMax=No, \n" : "OddMax=%.2f,%n", oddMax);
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        System.out.printf(evenMin == 0 ? "EvenMin=No, \n" : "EvenMin=%.2f,%n", evenMin);
        System.out.printf(evenMax == 0 ? "EvenMax=No \n" : "EvenMax=%.2f%n", evenMax);
    }
}
