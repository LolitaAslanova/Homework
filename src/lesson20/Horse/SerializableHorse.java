package lesson20.Horse;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Урок 20, задание 1
 * Создайте метод, который сериализует класс Horse(наследник класса Animal)
 * в файл и метод, который десериализует его.
 */

public class SerializableHorse {
    public static void main(String[] args) {
        Halter halter = new Halter();
        Horse h1 = new Horse("Pony", halter);
        serialise(h1);
        Horse deserializedHorse = deserialise();
    }

    public static void serialise(Horse h1) {
        try (FileOutputStream fs = new FileOutputStream("testSer.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(h1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Horse deserialise() {
        Horse h1 = null;
        try (FileInputStream fis = new FileInputStream("testSer.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)){
            h1 = (Horse) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return h1;
    }
}
