/**
 * Урок 5, задание 4
 * Распечатать все числа от 1 до 100.
 * Используем цикл do-while.
 */

package lesson5;

public class DoWhileHomework {
    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }
        while (n < 101);
    }
}