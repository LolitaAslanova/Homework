/**
 * Урок 3, задание 3
 * Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

package com.company;

import java.util.Scanner;

public class Chetnost {

    public static void main(String[] args) {
        System.out.print("Введите Ваше число: ");
        Scanner ch = new Scanner(System.in);
        int i;
        if (ch.hasNextInt()) {
            i = ch.nextInt();
            if (i % 2 == 0) {
                System.out.println("Ваше число чётное");
            } else {
                System.out.println("Ваше число нечётное");
            }
        } else {
            System.out.println("Ошибка, Вы ввели нецелое число");
        }
    }
}