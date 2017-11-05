/**
 * Урок 5 задание 1
 * Передать на вход программы число от 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д.
 * Если 6 или 7 –“Выходной”.
 * Используем конструкцию if-else-if.
 */

package com.company;

import java.util.Scanner;

public class IfElseIfHomework {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.print("Пятница");
        } else if (day == 6 || day == 7) {
            System.out.println("Выходной");
        } else {
            System.out.println("Введите ещё раз");
        }
    }
}