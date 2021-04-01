/*
Ани обича да пътува и иска тази година да посети няколко различни дестинации.
Като си избере дестинация, ще прецени колко пари ще й трябват, за да отиде до там и ще започне да спестява.
Когато е спестила достатъчно, ще може да пътува.
От конзолата всеки път ще се четат първо дестинацията и минималния бюджет, който ще е нужен за пътуването.
След това ще се четат няколко суми, които Ани спестява като работи и когато успее да събере достатъчно за пътуването, ще заминава, като на конзолата трябва да се изпише:
 "Going to {дестинацията}!"
Когато е посетила всички дестинации, които иска, вместо дестинация ще въведе "End" и програмата ще приключи.
 */

// Judge ready

package _13_NestedLoops_Lab;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input, destination;
        double budget, saved, result, i;
        budget = 0;
        result = 0;
        while (true) {
//            System.out.print("Въведи дестинация: ");
            input = s.nextLine();
            destination = input;
            if (!input.equals("End")) {
//                System.out.print("Въведи бюджет: ");
                input = s.nextLine();
                budget = Double.parseDouble(input);
                while (result <= budget) {
//                    System.out.print("Въведи сума: ");
                    saved = Double.parseDouble(s.nextLine());
                    result += saved;
                    if (result >= budget) {
                        System.out.printf("Going to %s!%n", destination);
                        saved = 0;
                        result = 0;
                        break;
                    }
                }
            } else {
                break;
            }
        }
    }
}


