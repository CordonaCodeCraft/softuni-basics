/*
Учениците могат да кандидатстват за социална стипендия или за стипендия за отличен успех.
Изискване за социална стипендия - доход на член от семейството по-малък от минималната работна заплата и успех над 4.5.
Размер на социалната стипендия - 35% от минималната работна заплата.
Изискване за стипендия за отличен успех - успех над 5.5, включително.
Размер на стипендията за отличен успех - успехът на ученика, умножен по коефициент 25.
Напишете програма, която при въведени доход, успех и минимална работна заплата,
дава информация дали ученик има право да получава стипендия, и стойността на стипендията, която е по-висока за него.
 */

package _08_ConditionalStatements_Exercises;

import java.util.Scanner;

public class _08_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double income, averageGrade, minSalary, socialScholarSize, gradeScholarSize;
        // Prompt user to enter initial parameters
        System.out.print("Въведи доход в лева: ");
        income = Double.parseDouble(s.nextLine());
        System.out.print("Въведи среден успех: ");
        averageGrade = Double.parseDouble(s.nextLine());
        System.out.print("Въведи минимална работна заплата в лева: ");
        minSalary = Double.parseDouble(s.nextLine());
        socialScholarSize = minSalary * 0.35;
        gradeScholarSize = averageGrade * 25;
        boolean socialScholarCompliance = income < minSalary && averageGrade > 4.5;
        boolean gradeScholarCompliance = averageGrade > 5.5;
        if (socialScholarCompliance) {
            if (gradeScholarCompliance) {
                if (gradeScholarSize > socialScholarSize) {
                    System.out.printf("You get a scholarship for excellent results %.0f", gradeScholarSize);
                } else {
                    System.out.printf("You get a Social scholarship %.0f BGN", socialScholarSize);
                }
            } else {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarSize);
            }
        } else if (gradeScholarCompliance) {
            if (socialScholarCompliance) {
                if (gradeScholarSize >= socialScholarSize) {
                    System.out.printf("You get a scholarship for excellent results %.0f", gradeScholarSize);
                } else if (socialScholarSize > gradeScholarSize) {
                    System.out.printf("You get a Social scholarship %.0f BGN", socialScholarSize);
                }
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f", gradeScholarSize);
            }
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
