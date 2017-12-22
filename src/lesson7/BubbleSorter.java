/**
 * Урок 7, задание 4
 * Изменить программу сортировки пузырьком:
 * а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так чтобы минимальный элемент "всплывал" в конец массива
 * (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 */

package lesson7;

public class BubbleSorter {
    public static void main(String[] array) {
        int mas[] = {1, 2, 4, 3, 5};
        sort(mas);
    }

    public static void sort(int[] array) {
        boolean chek = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    chek = true;
                }
            }
            if (!chek) {
                break;
            }
            chek = false;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}