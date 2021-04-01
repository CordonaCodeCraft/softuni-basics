/*
Отпечатайте на конзолата таблицата за умножение за числата от 1 до 10 във формат:
"{първи множител} * {втори множител} = {резултат}".
 */

// Judge ready

package _13_NestedLoops_Lab;

public class _02_Exercise {
    public static void main(String[] args) {
        int a, b, result;
        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++) {
                result = a * b;
                System.out.printf("%d * %d = %d%n", a, b, result);
            }
        }
    }
}
