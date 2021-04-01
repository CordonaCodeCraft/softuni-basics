/*
В сладкарница се провежда благотворителна кампания за събиране на средства, в която могат да се включат сладкари от цялата страна.
Първоначално прочитаме от конзолата броя на дните, в които тече кампанията и броя на сладкарите, които ще се включат.
След това на отделни редове получаваме количеството на тортите, гофретите и палачинките, които ще бъдат приготвени от един сладкар за един ден.
Трябва да се има предвид следния ценоразпис:
•	Торта - 45 лв.
•	Гофрета - 5.80 лв.
•	Палачинка - 3.20 лв.
1/8 от крайната сума ще бъде използвана за покриване на разходите за продуктите по време на кампанията.
Да се напише програма, която изчислява сумата, която е събрана в края на кампанията.
 */
package _06_SimpleOperationAndCalculations_Excercises;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Pricing of the items
        byte cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;
        // Prompt the user to enter initial parameters
        System.out.print("Въведи брой дни на благотворителната кампания: ");
        int days = Integer.parseInt(s.nextLine());
        System.out.print("Въведи брой на сладкарите: ");
        int people = Integer.parseInt(s.nextLine());
        System.out.print("Въведи брой на тортите: ");
        int cakesN = Integer.parseInt(s.nextLine());
        System.out.print("Въведи брой на гофретите: ");
        int wafflesN = Integer.parseInt(s.nextLine());
        System.out.print("Въведи брой на палачинките: ");
        int pancalesN = Integer.parseInt(s.nextLine());
        // Formulas
        double dayTurnover = ((cakesN * cakePrice) + (wafflesN * wafflePrice) + (pancalesN * pancakePrice)) * people;
        double moneyLeft = (dayTurnover-(dayTurnover/8))*days;
        System.out.printf("В края на кампанията ще бъдат събрани %.2f лева",moneyLeft);


    }
}
