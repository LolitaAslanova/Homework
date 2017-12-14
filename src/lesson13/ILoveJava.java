package lesson13;

/**
 * Урок 13, задание 1
 * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * Распечатать последний символ строки. Используем метод String.charAt().
 * Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String. startsWith().
 * Вырезать строку Java c помощью метода String.substring.
 * Заменить все символы “а” на “о”.
 * Преобразуйте строку к верхнему регистру.
 * Преобразуйте строку к нижнему регистру.
 * Вырезать строку Java c помощью метода String.substring.
 * Использование форматирования.
 */

public class ILoveJava {
    public static String s1() {
        return "I like Java!!!";
    }

    public static void main(String[] args) {
        System.out.println("Распечатать последний символ строки.");
        System.out.println(s1().charAt(s1().length() - 1));
        System.out.println("Проверить, заканчивается ли ваша строка подстрокой “!!!”.");
        System.out.println(s1().endsWith("!!!"));
        System.out.println("Проверить, начинается ли ваша строка подстрокой “I like”.");
        System.out.println(s1().startsWith("I like"));
        System.out.println("Заменить все символы “а” на “о”.");
        System.out.println(s1().replace('a', 'o'));
        System.out.println("Преобразуйте строку к верхнему регистру.");
        System.out.println(s1().toUpperCase());
        System.out.println("Преобразуйте строку к нижнему регистру.");
        System.out.println(s1().toLowerCase());
        System.out.println("Вырезать строку Java: ");
        System.out.println(s1().substring(7, 11));
        System.out.printf("I %s Java for %d years", "like", 5);
    }
}
