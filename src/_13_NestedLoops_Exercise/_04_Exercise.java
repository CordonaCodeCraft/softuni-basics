/*
Курсът "Train the trainers" е към края си и финалното оценяване наближава.
Вашата задача е да помогнете на журито което ще оценява презентациите,
като напишете програма в която да изчислява средната оценка от представянето на всяка една презентация от даден студент, а накрая средният успех от всички тях.
 */

// Judge ready

package _13_NestedLoops_Exercise;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jury, i, counter = 0;
        double score, themeScore = 0, totalScore = 0;
        String currentTheme;
//        System.out.print("Въведи членове на журито: ");
        jury = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи тема на презентацията: ");
        currentTheme = s.nextLine();
//        currentTheme = input;
        while (!currentTheme.equals("Finish")) {
            for (i = 1; i <= jury; i++) {
//                System.out.printf("Въведи оценка на %d член: ", i);
                counter++;
                score = Double.parseDouble(s.nextLine());
                themeScore += score;
            }
            System.out.printf("%s - %.02f.%n", currentTheme, themeScore / jury);
            totalScore += themeScore;
            themeScore = 0;
//            currentTheme = null;
//            System.out.print("Въведи тема на презентацията: ");
            currentTheme = s.nextLine();
        }
        System.out.printf("Student's final assessment is %.02f.", totalScore/counter);
    }
}
