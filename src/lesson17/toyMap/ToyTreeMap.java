package lesson17.toyMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Урок 17, задание 11
 * Переделать задание 8, используя TreeMap.
 */

public class ToyTreeMap {
    public static void main(String args[]) {
        Map<String, Toy> map = new TreeMap<>();
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
