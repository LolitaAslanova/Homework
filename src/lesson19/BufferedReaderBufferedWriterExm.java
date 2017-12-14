package lesson19;

import java.io.*;

/**
 * Урок 19, задание 3
 * Написать класс, который копирует содержимое из одного файла в другой.
 * Используем классы BufferedReader, FileReader, BufferedWriter , FileWriter.
 */
public class BufferedReaderBufferedWriterExm {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\io\\buff.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src\\io\\filebuff.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
