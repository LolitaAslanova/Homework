/**
 * Урок 3, задание 4
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

package com.company;

import java.util.Scanner;

public class SummCh {
    public static void main(String[] args) {
        System.out.print("Введите Ваше первое число: ");
        Scanner ch1 = new Scanner(System.in);
        int firstch;
        if (ch1.hasNextInt()) {
            firstch = ch1.nextInt();
            System.out.print("Введите Ваше второе число: ");
            Scanner ch2 = new Scanner(System.in);
            int secondch;
            if (ch2.hasNextInt()) {
                secondch = ch2.nextInt();
                System.out.println("Сумма двух чисел" + " " + (firstch + secondch));
            } else {
                System.out.println("Ошибка, Вы ввели нецелое число");
            }
        } else {
            System.out.println("Ошибка, Вы ввели нецелое число");
        }
    }
}
