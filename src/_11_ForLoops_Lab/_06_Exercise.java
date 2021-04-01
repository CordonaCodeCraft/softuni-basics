/*
Да се напише програма, която чете текст (стринг),
въведен от потребителя, и изчислява и отпечатва сумата от стойностите на гласните букви според таблицата по-долу:
 */

// Judge ready

package _11_ForLoops_Lab;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        int p = 0;
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'a':
                    p = 1;
                    break;
                case 'e':
                    p = 2;
                    break;
                case 'i':
                    p = 3;
                    break;
                case 'o':
                    p = 4;
                    break;
                case 'u':
                    p = 5;
                    break;
            }
            k = k+p;
            p = 0;
        }
        System.out.println(k);
    }
}
