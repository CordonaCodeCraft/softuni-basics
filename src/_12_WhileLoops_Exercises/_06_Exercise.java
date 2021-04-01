/*
Поканени сте на 30-ти рожден ден, на който рожденикът черпи с огромна торта.
Той обаче не знае колко парчета могат да си вземат гостите от нея.
Вашата задача е да напишете програма, която изчислява броя на парчетата, които гостите са взели, преди тя да свърши.
Ще получите размерите на тортата в сантиметри (широчина и дължина – цели числа в интервала [1...1000]) и след това на всеки ред,
до получаване на командата "STOP" или докато не свърши тортата, броят на парчетата, които гостите вземат от нея. Парчетата са квадратни с размер  1 см .
 */

// Judge ready

package _12_WhileLoops_Exercises;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        int length, width, piecesTotal, guests;
        String input;
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи дължина:");
        length = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи широчина:");
        width = Integer.parseInt(s.nextLine());
        piecesTotal = length * width;
        guests = 0;
        while (piecesTotal >= 0) {
//            System.out.print("Въведи брой гости или \"STOP\": ");
            input = s.nextLine();
            if (input.equals("STOP")) {
                System.out.printf("%d pieces are left.", piecesTotal);
                break;
            }
            guests = Integer.parseInt(input);
            piecesTotal -= guests;
            if (piecesTotal <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesTotal));
                break;
            }
        }
    }
}
