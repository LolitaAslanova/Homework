/**
 * Урок 5, задание 2
 * Передать на вход программы число от 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д.
 * Если 6 или 7 –“Выходной”.
 * Используем конструкцию switch.
 */

package com.company;

public class SwitchHomework {

    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        String week;
        switch (day) {
            case 1:
                week = "Понедельник";
                break;
            case 2:
                week = "Вторник";
                break;
            case 3:
                week = "Среда";
                break;
            case 4:
                week = "Четверг";
                break;
            case 5:
                week = "Пятница";
                break;
            case 6:
            case 7:
                week = "Выходной";
                break;
            default:
                week = "Введите ещё раз";
        }
        System.out.println("Ваш день - " + week);
    }
}