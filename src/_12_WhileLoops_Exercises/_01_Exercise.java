/*
Ани отива до родния си град след много дълъг период извън страната.
Прибирайки се вкъщи, тя вижда старата библиотека на баба си и си спомня за любимата си книга.
Помогнете на Ани, като напишете програма, в която тя въвежда търсената от нея книга (текст) и капацитета на библиотеката(цяло число).
Докато Ани не намери любимата си книга или не провери всички книги в библиотеката,
програмата трябва да чете всеки път на нов ред името на всяка следваща книга (текст), която тя проверява.
•	Ако не открие книгата да се отпечата на два реда:
o	"The book you search is not here!"
o	"You checked {брой} books."
•	Ако открие книгата си се отпечатва един ред:
o	"You checked {брой} books and found it."
 */

// Judge ready

package _12_WhileLoops_Exercises;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String favoriteBook, currentBook;
        int capacity, count;
//        System.out.print("Въведете любима книга: ");
        favoriteBook = s.nextLine();
//        System.out.print("Въведете капацитет на библиотеката: ");
        capacity = Integer.parseInt(s.nextLine());
        count = 1;
        while (count <= capacity) {
//            System.out.printf("Въведете име на %d книга: ", count);
            currentBook = s.nextLine();
            if (currentBook.equals(favoriteBook)) {
                System.out.printf("You checked %d books and found it.", count-1);
                break;
            }
            if (count == capacity) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", count);
                break;
            }
            count++;
        }
    }
}

