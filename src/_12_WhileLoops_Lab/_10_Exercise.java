/*
На осемнадесетия си рожден ден на Хосе взел решение, че ще се изнесе да живее на квартира.
Опаковал багажа си в кашони и намерил подходяща обява за апартамент под наем.
Той започва да пренася своя багаж на части, защото не може да пренесе целия наведнъж.
Има ограничено свободно пространство в новото си жилище, където може да разположи вещите, така че мястото да бъде подходящо за живеене.
Напишете програма, която изчислява свободния обем от жилището на Хосе, който остава след като пренесе багажа си.
Бележка: Един кашон е с точни размери:  1m. x 1m. x 1m.
 */

// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _10_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, v, k;
        String input;
//        System.out.print("Въведи a: ");
        a = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи b: ");
        b = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи c: ");
        c = Integer.parseInt(s.nextLine());
        v = a * b * c;
        while (v >= 1) {
//            System.out.print("Въведи брой кашони или командата \"Done\": ");
            input = s.nextLine();
            if (input.equals("Done")) {
                System.out.printf("%d Cubic meters left.", v);
                break;
            }
            k = Integer.parseInt(input);
            v = v - k;
            if (v <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(v));
                break;
            }
        }
    }
}
