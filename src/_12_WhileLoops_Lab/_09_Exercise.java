/*
Напишете програма, която изчислява средната оценка на ученик от цялото му обучение.
На първия ред ще получите името на ученика, а на всеки следващ ред неговите годишни оценки.
Ученикът преминава в следващия клас, ако годишната му оценка е по-голяма или равна на 4.00.
Ако ученикът бъде скъсан повече от един път, то той бива изключен и програмата приключва, като се отпечатва името на ученика и в кой клас бива изключен.
 При успешно завършване на 12-ти клас да се отпечата :
"{име на ученика} graduated. Average grade: {средната оценка от цялото обучение}"
В случай, че ученикът е изключен от училище, да се отпечата:
"{име на ученика} has been excluded at {класа, в който е бил изключен} grade"
*/

// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _09_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи име: ");
        String name = s.nextLine();
        double counter, crtGrade, total, avgGrade, prvGrade;
        counter = 1;
        total = 0;
        crtGrade = 0;
        avgGrade = 0;
        prvGrade = 0;
        while (counter <= 12) {
//            System.out.printf("Въведи оценка за %.0f клас: ", counter);
            crtGrade = Double.parseDouble(s.nextLine());
            if (crtGrade < 4) {
                if (prvGrade == 0 && crtGrade < 4) {
                    prvGrade = crtGrade;
                    continue;
                } else if (prvGrade < 4 && crtGrade < 4) {
                    System.out.printf("%s has been excluded at %.0f grade", name, counter);
                    break;
                }
            }
            total = total + crtGrade;
            avgGrade = total / 12;
            prvGrade = 0;
            counter++;
        }
        if (prvGrade == 0) {
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }
    }
}
