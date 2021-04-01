/*
Шивашки цех приема поръчки за ушиване на покривки и карета за маси.
Покривките са правоъгълни, каретата са квадратни, броят им винаги е еднакъв.
Покривката трябва да виси с 30 см от всеки ръб на масата.
Страната на каретата е половината от дължината на масите.
Във всяка поръчка се включва информация за броя и размерите на масите.
Напишете програма, която пресмята цената на поръчка в долари и в левове, като квадратен метър плат за правоъгълна покривка струва 7 долара, а за каре – 9 долара.
Курсът на долара е 1.85 лева.
 */

package _06_SimpleOperationAndCalculations_Excercises;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double leva = 1.85;
        // Prompt user to enter initial parameters
        System.out.print("Въведете брой маси: ");
        int tablesCount = Integer.parseInt(s.nextLine());
        System.out.print("Въведете дължина на масите в метри: ");
        double tablesLength = Double.parseDouble(s.nextLine());
        System.out.print("Въведете широчина на масите в метри: ");
        double tablesWidth = Double.parseDouble(s.nextLine());
        // Formulas to calculate faces of the items
        double priceCloth = ((tablesLength + 0.6) * (tablesWidth + 0.6)*5)*7;
        double priceQuad = ((tablesLength / 2) * (tablesLength / 2)*5)*9;
        double totalfiber = priceCloth+priceQuad;
        System.out.printf("Цената за %d покривки и карета %.2f долара или %.2f лева",tablesCount, totalfiber, totalfiber*leva);

    }


}

