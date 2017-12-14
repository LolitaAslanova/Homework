package lesson17.pets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Урок 17, задание 10
 * Cоздайте класс Pet и его наследников Cat, Dog, Parrot.
 * Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
 * а в качестве значения класс Pet. Добавьте в отображение разных животных.
 * Создайте метод выводящий на консоль все все ключи отображения.
 */
public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Barsik", new Cat("Barsik", "Dom1"));
        pets.put("Kesha", new Parrot("Kesha", "Dom2"));
        pets.put("Angel", new Dog("Angel", "Dom3"));

        iterateKeys(pets);

        System.out.println(pets.get("Kesha"));
    }

    private static void iterateKeys(Map<String, Pet> pets) {
        Set<String> keys = pets.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}