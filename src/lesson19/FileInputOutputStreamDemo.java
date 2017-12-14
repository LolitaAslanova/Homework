package lesson19;

import java.io.*;

/**
 * Урок 19, задание 2
 * Переписать класс FileInputOutputStreamDemo:
 * a) Добавить блок try-with-resources.
 * б) Замените for (int i = 0; i < c.length; i++) на блок for-each.
 * в) Пусть a.txt записывается в каталог src/io.
 */

public class FileInputOutputStreamDemo {
    public static void main(String args[]) {
        try (OutputStream output = new FileOutputStream("src\\io\\a.txt");
             InputStream input = new FileInputStream("src\\io\\a.txt")) {
            char c[] = {'a', 'b', 'c'};
            for (char i : c) {
                output.write(i);
            }
            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
