/*
Производителите на вендинг машини искали да направят машините си да връщат възможно най-малко монети ресто.
Напишете програма, която приема сума - рестото, което трябва да се върне и изчислява с колко най-малко монети може да стане това.
 */

// Judge ready

package _12_WhileLoops_Exercises;

import java.util.Scanner;

public class _05_Exercise {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coinsTotal;
        double input, converted, count;
//        System.out.print("Въведете ресто: ");
        input = Double.parseDouble(s.nextLine());
        converted = (int)(input / 0.01);
        coinsTotal = 0;
        count = converted;
        while (count >= 0.0) {
            count %= 10;
            if (count == 0) {
                coinsTotal += 0;
            } else if (count == 1 || count == 2 || count == 5) {
                coinsTotal += 1;
            } else if (count >= 3 && count <= 7) {
                coinsTotal += 2;
            } else {
                coinsTotal += 3;
            }
            count = (converted - count) % 100;
            if (count == 0) {
                coinsTotal += 0;
            } else if (count == 10 || count == 20 || count == 50) {
                coinsTotal += 1;
            } else if (count >= 30 && count <= 70) {
                coinsTotal += 2;
            } else {
                coinsTotal += 3;
            }
            if (converted <= 999) {
                count = Math.floor((converted - count) / 100 % 10);
            } else {
                count = Math.floor((converted - count) / 100);
            }
            if (count == 0) {
                coinsTotal += 0;
            } else if (count == 2 || count == 1) {
                coinsTotal += 1;
            } else {
                coinsTotal += (int) ((count / 2) + (count % 2));
            }
            break;
        }
        System.out.println(coinsTotal);
    }
}
