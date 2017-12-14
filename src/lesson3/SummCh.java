/**
 * Урок 3, задание 4
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

package lesson3;

import java.util.Scanner;

public class SummCh {
    public static void main(String[] args) {
        System.out.print("Введите два целых числа: ");
        Scanner ch = new Scanner(System.in);
        int ch1 = doit(ch);
        int ch2 = doit(ch);
        System.out.println("Сумма двух чисел " + (ch1 + ch2));
    }

    private static int doit(Scanner ch) {
        if (ch.hasNextInt()) {
            int x = ch.nextInt();
            return x;
        } else {
            System.out.println("Ошибка, Вы ввели нецелое число");
            System.exit(0);
        }
        return 0;
    }
}
