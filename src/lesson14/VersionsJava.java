/**
 * Урок 14, задание 1
 * Дана строка “Versions: Java  5, Java 6, Java   7, Java 8.” .
 * Найти все подстроки "Java X" и распечатать их.
 */

package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionsJava {
    public static void main(String[] args) {
        String vers = "Versions: Java  5, Java 6, Java   7, Java 8.";
        Pattern pattern = Pattern.compile("Java\\s*\\d");
        Matcher matcher = pattern.matcher(vers);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
