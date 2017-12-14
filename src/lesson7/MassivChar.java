/**
 * Урок 7, задание 1
 * Создать двумерный массив типа char размером 4х2. И записать туда значения с помощью блока для инициализации.
 * Распечатать значения массива с помощью метода Arrays.deepToString(m).
 */

package lesson7;

import java.util.Arrays;

public class MassivChar {
    public static void main(String[] args) {
        char array[][] = {
                {'f', 'd'},
                {'s', 'e'},
                {'d', 'y'},
                {'b', 'w'}
        };
        System.out.println(Arrays.deepToString(array));
    }
}
