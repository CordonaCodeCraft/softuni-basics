/*
Иван решава да подобри Световния рекорд по плуване на дълги разстояния.
На конзолата се въвежда рекордът в секунди, който Иван трябва да подобри,
разстоянието в метри, което трябва да преплува и времето в секунди, за което плува разстояние от 1 м.
Да се напише програма, която изчислява дали се е справил със задачата, като се има предвид, че:
съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
Когато се изчислява колко пъти Иванчо ще се забави, в резултат на съпротивлението на водата,
резултатът трябва да се закръгли надолу до най-близкото цяло число.
Да се изчисли времето в секунди, за което Иванчо ще преплува разстоянието и разликата спрямо Световния рекорд.

 */
package _08_ConditionalStatements_Exercises;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Prompt user to enter initial parameters
        double worldRecord, targetDistance, personalSeconds, personalRecord;
        System.out.print("Въведи световен рекорд в секунди:");
        worldRecord = Double.parseDouble(s.nextLine());
        System.out.print("Въведи целева дистанция в метри:");
        targetDistance = Double.parseDouble(s.nextLine());
        System.out.print("Въведи лично време за метър в секунди:");
        personalSeconds = Double.parseDouble(s.nextLine());
        double painMeter = Math.round(targetDistance / 15);
        personalRecord = (targetDistance * personalSeconds) + (painMeter * 12.5);
        if (worldRecord < personalRecord) {
            System.out.printf("No, he failed! He was %.2f seconds slower", personalRecord - worldRecord);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", personalRecord);
        }
    }
}
