package lesson13;

/**
 * Урок 13, задание 2
 * a)Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168
 * Используем метод StringBuilder.append.
 * б) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 * в) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */

public class SumThreeAndFiftSix {
    public static void main(String args[]) {
        String sum;
        int a = 3;
        int b = 56;
        StringBuilder sb = new StringBuilder();

        sum = sb.append("3 + 56 = ").append(a + b).append("\n").append("3 - 56 = ").append(a - b).append("\n")
                .append("3 * 56 = ").append(a * b).toString();
        System.out.println(sum);
        sb.replace(7, 8, "равно");
        sb.replace(23, 24, "равно");
        sb.replace(40, 41, "равно");
        System.out.println(sb);
    }
}
