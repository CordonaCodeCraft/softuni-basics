/*
Напишете програма, която извежда на конзолата номерата на стаите в една сграда (в низходящ ред), като са изпълнени следните условия:
•	На всеки четен етаж има само офиси
•	На всеки нечетен етаж има само апартаменти
•	Всеки апартамент се означава по следния начин : А{номер на етажа}{номер на апартамента}, номерата на апартаментите започват от 0.
•	Всеки офис се означава по следния начин : О{номер на етажа}{номер на офиса}, номерата на офисите също започват от 0.
•	На последният етаж винаги има апартаменти и те са по-големи от останалите, за това пред номера им пише 'L', вместо 'А'. Ако има само един етаж, то има само големи апартаменти!
От конзолата се прочитат две цели числа - броят на етажите и броят на стаите за един етаж.
 */

// Judge ready

package _13_NestedLoops_Lab;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int floorsTotal, roomsFloor, roomNumber, f, r;
//        System.out.print("Въведи брой етажи: ");
        floorsTotal = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи брой стаи: ");
        roomsFloor = Integer.parseInt(s.nextLine());
        roomNumber = -1;
        for (f = floorsTotal; f >= 1; f--) {
            roomNumber = -1;
            for (r = roomsFloor; r >= 1; r--) {
                roomNumber++;
                if (floorsTotal == 1) {
                    System.out.printf("L%d%d ", f, roomNumber);
                } else if (f == floorsTotal) {
                    System.out.printf("L%d%d ", f, roomNumber);
                } else if (f % 2 == 0) {
                    System.out.printf("O%d%d ", f, roomNumber);
                } else {
                    System.out.printf("A%d%d ", f, roomNumber);
                }
            }
            System.out.println();
        }
    }
}
