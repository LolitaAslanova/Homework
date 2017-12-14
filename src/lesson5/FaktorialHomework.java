/**
 * Урок 5, задание 7
 * Реализовать подсчет факториала используя цикл for.
 * n! = 1*2*...*n;​
 * 0!=1;
 * 5! = 1*2*3*4*5;
 * Число n задается случайным образом (используйте Math.random()).
 */

package lesson5;

public class FaktorialHomework {
    public static void main(String[] args) {
        int f = 1;
        int randomstep = f + (int) (Math.random() * 10);
        System.out.println("Ниже приведен пример вычесления факториала " + randomstep);
        for (int i = 1; i <= randomstep; i++) {
            f *= i;
            System.out.println(f);
        }
    }
}