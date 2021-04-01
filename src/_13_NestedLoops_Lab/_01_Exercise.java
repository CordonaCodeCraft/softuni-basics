/*
Напишете програма, която отпечатва часовете в денонощието от 0:0 до 23:59, всеки на отделен ред.
Часовете трябва да се изписват във формат "{час}:{минути}".
 */

// Judge ready

package _13_NestedLoops_Lab;

public class _01_Exercise {
    public static void main(String[] args) {
        int hours, minutes;
        for (hours = 0; hours < 24; hours++) {
            for (minutes = 0; minutes < 60; minutes++) {
                System.out.println(hours + ":" + minutes);
            }
        }
    }
}
