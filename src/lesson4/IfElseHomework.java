/**
 * Урок 4, задание 5
 * С помощью класса Scanner ввести целое число.
 * Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10”.
 * Иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 * Используем оператор if-else.
 */

package lesson4;

import java.util.Scanner;

public class IfElseHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 10");
        if (scanner.hasNextInt()) {
            int ch2 = scanner.nextInt();
            if (0 < ch2 && ch2 < 10) {
                System.out.println("Положительное число меньше 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        }
    }

}

