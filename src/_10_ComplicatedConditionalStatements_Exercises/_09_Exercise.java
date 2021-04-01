/*
Студент трябва да отиде на изпит в определен час.
Той идва в изпитната зала в даден час на пристигане.
Счита се, че студентът е дошъл навреме, ако е пристигнал в часа на изпита или до половин час преди това.
Ако е пристигнал по-рано повече от 30 минути, той е подранил.
Ако е дошъл след часа на изпита, той е закъснял.
Напишете програма, която прочита време на изпит и време на пристигане и отпечатва дали студентът е дошъл навреме,
дали е подранил или е закъснял и с колко часа или минути е подранил или закъснял.
 */

package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _09_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double examHour, examMinutes, studentHour, studentMinutes, resultHour, resultMinutes, examTotalMinutes, studentTotalMinutes, sumTotalMinutes;
        System.out.print("Въведи час на изпита: ");
        examHour = Integer.parseInt(s.nextLine());
        System.out.print("Въведи минути на изпита: ");
        examMinutes = Integer.parseInt(s.nextLine());
        System.out.print("Въведи час на пристигане: ");
        studentHour = Integer.parseInt(s.nextLine());
        System.out.print("Въведи минути на пристигане: ");
        studentMinutes = Integer.parseInt(s.nextLine());
        examTotalMinutes = (examHour * 60) + examMinutes;
        studentTotalMinutes = (studentHour * 60) + studentMinutes;
        sumTotalMinutes = Math.abs(examTotalMinutes - studentTotalMinutes);
        resultHour = Math.floor(sumTotalMinutes / 60);
        resultMinutes = Math.abs(sumTotalMinutes % 60);
        boolean onTime = (examTotalMinutes == studentTotalMinutes) || (examHour > studentHour && (resultMinutes <= 30) && resultMinutes != 0);
        boolean early = (examHour > studentHour) && (resultMinutes > 30 || resultMinutes == 0);
        if (onTime) {
            if (examTotalMinutes == studentTotalMinutes) {
                System.out.println("On time");
            } else {
                if (resultHour == 0) {
                    System.out.println("On Time");
                    System.out.printf("%.0f minutes before the start", resultMinutes);
                } else {
                    System.out.println("On Time");
                    System.out.printf("%.0f:%.0f hours before the start", resultHour, resultMinutes);
                }
            }
        } else if (early) {
            if (resultHour == 0) {
                System.out.println("Early");
                System.out.printf("%.0f minutes before the start", resultMinutes);
            } else {
                System.out.println("Early");
                System.out.printf("%.0f:%.0f hours before the start", resultHour, resultMinutes);
            }
        }else {
            if (resultHour == 0) {
                System.out.println("Late");
                System.out.printf("%.0f minutes after the start", resultMinutes);
            } else {
                System.out.println("Late");
                System.out.printf("%.0f:%.0f hours after the start", resultHour, resultMinutes);
            }
        }
    }
}
