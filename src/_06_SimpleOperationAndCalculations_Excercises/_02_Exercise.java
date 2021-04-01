/*
Напишете програма, която чете ъгъл в радиани (rad) и го преобразува в градуси (deg).
Използвайте формулата: градус = радиан * 180 / π.
Числото π в Java програми е достъпно чрез Math.PI.
Закръглете резултата до най-близкото цяло число използвайки "%.0f".
 */

package _06_SimpleOperationAndCalculations_Excercises;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи ъгъл в радиани: ");
        double rad = Double.parseDouble(s.nextLine());
        double deg = (rad * 180) / Math.PI;
        System.out.printf("%f радиана са %.0f градуса",rad, deg);
    }
}
