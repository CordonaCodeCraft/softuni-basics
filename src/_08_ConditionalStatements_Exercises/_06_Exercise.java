/*
Снимките за дългоочаквания филм "Годзила срещу Конг" започват.
Сценаристът Адам Уингард ви моли да напишете програма, която да изчисли, дали предвидените средства са достатъчни за снимането на филма.
За снимките  ще бъдат нужни определен брой статисти, облекло за всеки един статист и декор.
Известно е, че:
•	Декорът за филма е на стойност 10% от бюджета.
•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.

 */
package _08_ConditionalStatements_Exercises;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Prompt user to enter initial parameters
        System.out.print("Въведи бюджет: ");
        double budget = Double.parseDouble(s.nextLine());
        System.out.print("Въведи брой статисти: ");
        int staff = Integer.parseInt(s.nextLine());
        System.out.print("Въведи единична цена на облекло: ");
        double costumesPrice = Double.parseDouble(s.nextLine());
        // Formulas to calculate the costs
        double decor = budget * 0.1;
        if (staff > 150) {
            costumesPrice *= 0.9;
        }
        double totalCosts = (costumesPrice*staff) + decor;
        if (totalCosts > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more", totalCosts-budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left", budget - totalCosts);
        }
    }
}
