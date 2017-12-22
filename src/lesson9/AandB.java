package lesson9;

/**
 * Урок 9, задание 5
 * Даны два целых числа A и В.
 * Выведите все числа от A до B включительно, в порядке возрастания,
 * если A < B, или в порядке убывания в противном случае.
 * Использовать рекурсию.
 */

public class AandB {
    public static void main(String[] args) {
        int a = 46;
        int b = 35;
        recurMethod(a, b);
    }

    public static void recurMethod(int a, int b) {
        System.out.println(a);
        if (a > b) {
            a--;
        } else {
            a++;
        }
        if (a != b) {
            recurMethod(a, b);
        }
    }
}
