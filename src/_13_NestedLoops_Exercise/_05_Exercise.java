/*
Да се напише програма, която чете две цели числа n и l, въведени от потребителя, и генерира по азбучен ред всички възможни  пароли, които се състоят от следните 5 символа:
•	Символ 1: цифра от 1 до n.
•	Символ 2: цифра от 1 до n.
•	Символ 3: малка буква измежду първите l букви на латинската азбука.
•	Символ 4: малка буква измежду първите l букви на латинската азбука.
•	Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.

 */

// Judge ready
package _13_NestedLoops_Exercise;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, l, a, b, c, d, e;
        String chars = "abcdefghi";
//        System.out.print("Въведи стойност за \"n\": ");
        n = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи стойност за \"l\": ");
        l = Integer.parseInt(s.nextLine());
        for (a = 1; a < n; a++) {
            for (b = 1; b < n; b++) {
                for (c = 0; c < l; c++) {
                    for (d = 0; d < l; d++) {
                        for (e = 1; e <= n; e++) {
                            if (e > a && e > b) {
                                System.out.printf("%d%d%c%c%d ", a, b, chars.charAt(c), chars.charAt(d), e);
                            }
                        }
                    }
                }
            }
        }
    }
}
