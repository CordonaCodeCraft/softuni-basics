/*
Напишете програма, която отпечатва числата в диапазона [1…1000], които завършват на 7.
 */

// Judge ready

package _11_ForLoops__Exercises;

public class _01_Exercise {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
