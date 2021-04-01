/*
Шеф на компания забелязва че все повече служители прекарват  време в сайтове, които ги разсейват.
За да предотврати това, той въвежда изненадващи проверки на отворените табове на браузъра на служителите си.
Според сайта се налагат различни глоби:
•	"Facebook" -> 150 лв.
•	"Instagram" -> 100 лв.
•	"Reddit" -> 50 лв.
От конзолата се четат два реда:
•	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
•	Заплата - число в интервала [700...1500]
След това n – на брой пъти се чете име на уебсайт – текст
Ако по време на проверката заплатата стане по-малка или равна на 0 лева, на конзолата се изписва
"You have lost your salary." и програмата приключва.
В противен случай след проверката на конзолата се изписва остатъкът от заплатата (да се изпише като цяло число).
 */

package _11_ForLoops__Exercises;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        int openedTabs, totalPenalty, i;
        double salary, remainingSalary;
        String sites;
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи брой отворени табове: ");
        openedTabs = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи размер на заплата: ");
        salary = Double.parseDouble(s.nextLine());
        totalPenalty = 0;
        remainingSalary = 0;
        for (i = 1; i <= openedTabs; i++) {
            remainingSalary = salary - totalPenalty;
            if (remainingSalary <= 0) {
                break;
            }
//            System.out.print("Въведи сайт: ");
            sites = s.nextLine();
            switch (sites) {
                case "Facebook":
                    totalPenalty = totalPenalty + 150;
                    break;
                case "Instagram":
                    totalPenalty = totalPenalty + 100;
                    break;
                case "Reddit":
                    totalPenalty = totalPenalty + 50;
                    break;
                default:
                    totalPenalty = totalPenalty + 0;
            }
        }
        if (remainingSalary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", remainingSalary);
        }
    }
}

