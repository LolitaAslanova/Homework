package lesson17.ToyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Урок 17, задание 8
 * Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Toy).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен игрушек  - keySet().
 * Перебрать и распечатать значения игрушек - values().
 * Для каждого перебора создать свой метод.
 */

public class HashMapExm {
    public static void main(String args[]) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Doll", new Toy("Doll", 12));
        map.put("Box", new Toy("Box", 62));
        map.put("Car", new Toy("Car", 95));

        iterateEntries(map);
        iterateKeys(map);
    }

    private static void iterateKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.print(key);
            System.out.println(map.get(key));
        }
    }

    private static void iterateEntries(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> entries = map.entrySet();
        for (Map.Entry<String, Toy> entry : entries) {
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
