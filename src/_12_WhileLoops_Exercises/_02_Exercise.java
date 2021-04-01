/*
Напишете програма, в която Марин решава задачи от изпити, докато не получи съобщение "Enough" от лектора си.
При всяка решена задача, той получава оценка.
Програмата трябва да приключи прочитането на данни при команда "Enough" или ако Марин получи определеният брой незадоволителни оценки.
Незадоволителна е всяка оценка, която е по-малка или равна на 4.
 */

// Judge ready

package _12_WhileLoops_Exercises;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maxFails, totalFails, grade, count;
        double totalGrade, avgScore;
        String task, lastTask;
//        System.out.print("Въведи максимален брой ниски оценки: ");
        maxFails = Integer.parseInt(s.nextLine());
        grade = 0;
        totalGrade = 0;
        avgScore = 0;
        totalFails = 0;
        count = 1;
        lastTask = null;
        while (count < Integer.MAX_VALUE) {
//            System.out.print("Въведи име на задача: ");
            task = s.nextLine();
            if (task.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", avgScore);
                System.out.printf("Number of problems: %d%n", count-1);
                System.out.printf("Last problem: %s%n", lastTask);
                break;
            }
//            System.out.print("Въведи оценка: ");
            grade = Integer.parseInt(s.nextLine());
            totalGrade += grade;
            avgScore = totalGrade / count;
            if (grade <= 4) {
                totalFails++;
            }
            if (totalFails == maxFails) {
                System.out.printf("You need a break, %d poor grades.", totalFails);
                break;
            }
            lastTask = task;
            count++;
        }
    }
}
