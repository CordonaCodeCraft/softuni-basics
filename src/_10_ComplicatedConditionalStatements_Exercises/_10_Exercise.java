/*
Влади е студент, живее в София и си ходи от време на време до родния град.
Той е много запален по волейбола, но е зает през работните дни и играе волейбол само през уикендите и в празничните дни.
Влади играе в София всяка събота, когато не е на работа и не си пътува до родния град, както и в 2/3 от празничните дни.
Той пътува до родния си град h пъти в годината, където играе волейбол със старите си приятели в неделя.
Влади не е на работа 3/4 от уикендите, в които е в София.
Отделно, през високосните години Влади играе с 15% повече волейбол от нормалното.
Приемаме, че годината има точно 48 уикенда, подходящи за волейбол.
Напишете програма, която изчислява колко пъти Влади е играл волейбол през годината.
Закръглете резултата надолу до най-близкото цяло число (например 2.15  2; 9.95  9).

3/4 се изразява като 3.0 / 4 = 0.75
2/3 се изразява като 2.0 / 3 = 0.66

3/4 от някакво число се изразява като числото * 0.75
 */

package _10_ComplicatedConditionalStatements_Exercises;

import java.util.Scanner;

public class _10_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double p, travelWeekends, sofiaGames, holidayGames, totalGames, yearTypeGames;
        String yearType = s.nextLine();
        p = Double.parseDouble(s.nextLine());
        travelWeekends = Double.parseDouble(s.nextLine());
        sofiaGames = (48 - travelWeekends) * 0.75;
        holidayGames = p * 0.66;
        totalGames = sofiaGames + travelWeekends + holidayGames;
        yearTypeGames = Math.round(yearType.equals("leap") ? totalGames += totalGames * 0.15 : totalGames);
        System.out.printf("%.0f", yearTypeGames);
    }
}

