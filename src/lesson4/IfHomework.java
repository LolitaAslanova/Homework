/**
 * Урок 4, задание 4
 * Передать на вход программы число в качестве аргумента. Если оно нечетное, распечатать его. Используем оператор if.
 * Используйте метод Integer.parseInt() для преобразования из String в int.
 */

package lesson4;

import java.util.Scanner;

public class IfHomework {
    public static void main(String[] args) {
        int ch = Integer.parseInt(args[0]);
        if (ch % 2 == 1) {
            System.out.println("Vashe chislo " + ch + " nechetnoe");
        }
    }
}