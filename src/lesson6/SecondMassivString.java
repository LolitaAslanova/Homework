/**
 * Урок 6, задание 3
 * Создать массив типа String размером 3х6. И записать в него значения:
 * a1  a2  a3  a4  a5  a6
 * b1  b2  b3  b4  b5  b6
 * c1  c2   c3  c4  c5  c6
 * И распечатать.
 */

package lesson6;

public class SecondMassivString {
    public static void main(String[] args) {
        char index = 'a';
        String[][] mas = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                mas[i][j] = index + "" + (j + 1);
            }
            index++;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}