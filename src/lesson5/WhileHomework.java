/**
 * Урок 5, задание 3
 * Распечатать 10 строк:
 * “Task1”...“Task10”.
 * Используем цикл while.
 */

package lesson5;

public class WhileHomework {
    public static void main(String[] args) {
        int t = 1;
        while (t < 11) {
            System.out.println("Task" + t + ".");
            t++;
        }
    }
}
