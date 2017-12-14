package lesson19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Урок 19, задание 1
 * Переписать класс FileCopy:
 * Добавить блок try-with-resources.
 * Убрать throws IOException  из объявления main() метода. И добавить соответствующий catch блок.
 */

public class FileCopy {
    public static void main(String args[]) {

        try (FileInputStream fileIn = new FileInputStream("src\\io\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\io\\copied_file.txt")) {

            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}