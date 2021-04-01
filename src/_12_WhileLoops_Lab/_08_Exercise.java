/*
Напишете програма, която изчислява средната оценка на ученик от цялото му обучение.
На първия ред ще получите името на ученика, а на всеки следващ ред неговите годишни оценки.
Ученикът преминава в следващия клас, ако годишната му оценка е по-голяма или равна на 4.00.
Ако оценката му е под 4.00, той ще повтори класа.
При успешно завършване на 12-ти клас да се отпечата:
"{име на ученика} graduated. Average grade: {средната оценка от цялото обучение}"
Стойността трябва да бъде форматирана до втория знак след десетичната запетая.
*/

// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _08_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи име: ");
        String name = s.nextLine();
        double counter, grade, total, avgGrade;
        counter = 1;
        total = 0;
        avgGrade = 0;
        while (counter <= 12) {
//            System.out.printf("Въведи оценка за %.0f клас: ", counter);
            grade = Double.parseDouble(s.nextLine());
            if (grade < 4) {
                continue;
            }
            total = total + grade;
            avgGrade = total / 12;
            counter++;
//            System.out.printf("Въведи оценка за %.0f клас: ", counter);
//            grade = Double.parseDouble(s.nextLine());

        }
        System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
    }
//        if (grade < 4) {
//            System.out.printf("Повтори %.0f клас: ", counter);
//            grade = Double.parseDouble(s.nextLine());
//        } else {
}