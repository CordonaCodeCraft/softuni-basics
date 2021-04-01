/*
Вашата задача е да напишете програма, която да изчислява процента на билетите за всеки тип от продадените билети: студентски(student), стандартен(standard) и детски(kid), за всички прожекции.
Трябва да изчислите и колко процента от залата е запълнена за всяка една прожекция.
 */

// Judge ready

package _13_NestedLoops_Lab;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int freeSeats, studentTickets, standardTickets, kidTickets, soldTickets, totalStudent, totalStandard, totalKids, totalSoldTickets;
        double moviePercent;
        String input, currentMovie;
        studentTickets = 0;
        standardTickets = 0;
        kidTickets = 0;
        soldTickets = 0;
        totalStudent = 0;
        totalStandard = 0;
        totalKids = 0;
        totalSoldTickets = 0;
        while (true) {
//            System.out.print("Въведи име на филм или \"Finish\": ");
            input = s.nextLine();
            currentMovie = input;
            if (!input.equals("Finish")) {
//                System.out.print("Въведи брой свободни места: ");
                freeSeats = Integer.parseInt(s.nextLine());
                while (freeSeats > soldTickets) {
//                    System.out.print("Избери вид билет 1) \"student\" 2) \"standard\" 3) \"kid\" или \"End\": ");
                    input = s.nextLine();
                    switch (input) {
                        case "student":
                            studentTickets++;
                            break;
                        case "standard":
                            standardTickets++;
                            break;
                        case "kid":
                            kidTickets++;
                            break;
                        case "End":
                            break;
                    }
                    soldTickets = studentTickets + standardTickets + kidTickets;
                    moviePercent = 1.0 * (soldTickets) * 100 / freeSeats;
                    if (input.equals("End") || soldTickets >= freeSeats) {
                        System.out.printf("%s - %.02f%% full.%n", currentMovie, moviePercent);
                        totalStudent += studentTickets;
                        totalStandard += standardTickets;
                        totalKids += kidTickets;
                        totalSoldTickets += soldTickets;
                        soldTickets = 0;
                        studentTickets = 0;
                        standardTickets = 0;
                        kidTickets = 0;
                        break;
                    }
                }
            } else {
                System.out.printf("Total tickets: %d%n", totalSoldTickets);
                System.out.printf("%.2f%% student tickets.%n", totalStudent*100.0/totalSoldTickets);
                System.out.printf("%.2f%% standard tickets.%n", totalStandard*100.0/totalSoldTickets);
                System.out.printf("%.2f%% kids tickets.%n", totalKids*100.0/totalSoldTickets);
                break;
            }
        }
    }
}
