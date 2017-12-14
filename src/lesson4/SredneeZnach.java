/**
 * Урок 4, задание 3
 * Вычислить среднее значение вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Используйте цикл for, пример.
 * Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
package lesson4;

public class SredneeZnach {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }
        System.out.println(sum / args.length);
    }
}
