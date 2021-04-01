/*
Габи иска да започне здравословен начин на живот и си е поставила за цел да върви 10 000 стъпки всеки ден.
Някои дни обаче е много уморена от работа и ще иска да се прибере преди да постигне целта си.
Напишете програма, която чете от конзолата по колко стъпки изминава тя всеки път като излиза през деня и когато постигне целта си да се изписва "Goal reached! Good job!"
 */

// Judge ready

package _12_WhileLoops_Exercises;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target, steps, totalSteps;
        String input;
        target = 10000;
        steps = 0;
        totalSteps = 0;
        while (true) {
//            System.out.print("Въведи брой крачки или \"Going home\": ");
            input = s.nextLine();
            if (input.equals("Going home")) {
//                System.out.print("Въведи брой крачки към вкъщи: ");
                steps = Integer.parseInt(s.nextLine());
                totalSteps += steps;
                if (totalSteps >= target) {
                    System.out.println("Goal reached! Good job!");
                } else {
                    System.out.printf("%d more steps to reach goal.", target - totalSteps);
                }
                break;
            }
            steps = Integer.parseInt(input);
            totalSteps += steps;
            if (totalSteps >= target) {
                System.out.println("Goal reached! Good job!");
                break;
            }
        }
    }
}
