/*
Напишете програма, която първоначално прочита име и парола на потребителски профил.
След това чете парола за вход, при въвеждане на грешна парола, потребителя да се подкани да въведе нова парола.
 */

// Judge ready

package _12_WhileLoops_Lab;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        String username, profilePassword, userPassword;
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи потребителско име: ");
        username = s.nextLine();
//        System.out.print("Въведи парола за профил: ");
        profilePassword = s.nextLine();
//        System.out.print("Въведи парола за вход: ");
        userPassword = s.nextLine();
        while (!userPassword.equals(profilePassword)) {
//            System.out.print("Въведи парола за вход: ");
            userPassword = s.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
