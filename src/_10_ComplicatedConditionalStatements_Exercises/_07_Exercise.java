/*
Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена математическа операция с тях.
Възможните операции са: Събиране(+), Изваждане(-), Умножение(*), Деление(/) и Модулно деление(%).
При събиране, изваждане и умножение на конзолата трябва да се отпечатат резултата и дали той е четен или нечетен.
При обикновеното деление – резултата.
При модулното деление – остатъка.
Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се дели. В този случай трябва да се отпечата специално съобщениe.
 */
package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double inputOne, inputTwo, result;
        System.out.print("Въведи първо число: ");
        inputOne = Integer.parseInt(s.nextLine());
        System.out.print("Въведи второ число: ");
        inputTwo = Integer.parseInt(s.nextLine());
        System.out.print("Въведи оператор: 1) + 2) - 3) * 4) / 5) %: ");
        String operator = s.nextLine();
        result = 0;
        switch (operator) {
            case "+":
                result = inputOne + inputTwo;
                break;
            case "-":
                result = inputOne - inputTwo;
                break;
            case "*":
                result = inputOne * inputTwo;
                break;
            case "/":
                if (inputTwo == 0) {
                    System.out.printf("Cannot divide %.0f by zero ", inputOne);
                } else {
                    result = inputOne / inputTwo;
                    System.out.printf("%.0f %s %.0f = %.2f", inputOne, operator, inputTwo, result);
                }
                break;
            case "%":
                if (inputTwo == 0) {
                    System.out.printf("Cannot divide %.0f by zero ", inputOne);
                } else {
                    result = inputOne % inputTwo;
                    System.out.printf("%.0f %s %.0f = %.0f", inputOne, operator, inputTwo, result);
                }
                break;
        }
        boolean isEven = result % 2 == 0;
        String evenOrOdd = isEven ? "even" : "odd";
        switch (operator) {
            case "+":
            case "-":
            case "*":
                System.out.printf("%.0f %s %.0f = %.0f – %s", inputOne, operator, inputTwo, result, evenOrOdd);
                break;
        }
    }
}
