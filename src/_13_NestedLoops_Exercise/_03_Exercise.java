/*
Напишете програма, която чете от конзолата цели числа в диапазона от -2,147,483,648 до 2,147,483,647, докато не се получи команда "stop".
Да се намери сумата на всички въведени прости и сумата на всички въведени непрости числа.
Тъй като по дефиниция от математиката отрицателните числа не могат да бъдат прости, ако на входа се подаде отрицателно число да се изведе следното съобщение "Number is negative.".
В този случай въведено число се игнорира и не се прибавя към нито една от двете суми, а програмата продължава своето изпълнение, очаквайки въвеждане на следващо число.
 */

// Judge ready

package _13_NestedLoops_Exercise;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i, primeSum, nonPrimeSum;
        String input;
        primeSum = 0;
        nonPrimeSum = 0;
        while (true) {
//            System.out.print("Въведете число: ");
            input = s.nextLine();
            if (!input.equals("stop")) {
                n = Integer.parseInt(input);
                if (n < 0) {
                    System.out.println("Number is negative.");
                } else {
                    if (n == 0 || n == 1) {
                        nonPrimeSum += n;
                    } else {
                        boolean prime = true;
                        for (i = 2; i <= n / 2; i++) {
                            if (n % i == 0) {
                                prime = false;
                            }
                        }
                        if (prime) {
                            primeSum += n;
                        } else {
                            nonPrimeSum += n;
                        }
                    }
                }
            } else {
                break;
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
