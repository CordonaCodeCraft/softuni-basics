/*
Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN).
Закръглете резултата до 2 цифри след десетичната запетая.
Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.
 */

package _06_SimpleOperationAndCalculations_Excercises;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Въведи сума в долари: ");
        int usd = Integer.parseInt(s.nextLine());
        double leva = 1.79549;
        System.out.printf("%d долара са %.2f лева", usd, usd*leva);
    }
}
