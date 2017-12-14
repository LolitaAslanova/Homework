package lesson21.strThread;

/**
 * Урок 21, задание 2
 * Необходимо создать три потока которые изменяют один и тот же объект.
 * Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.
 * a) Создать класс расширяющий Thread.
 * б) Переопределить метод run(), здесь будет находится синхронизированный блок кода.
 * в) Для того чтобы три объекта-потока имели доступ к одному объекту,
 * создаем конструктор принимающий на вход StringBuilder объект.
 * г) Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта в).
 * д) Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз,
 * а потом увеличьте значение символа на 1.
 * е) В методе main() создайте один объект класса StringBuilder, используя символ ‘a’.
 * Затем создайте три экземпляра объекта нашего класса и запустите потоки.
 */


public class StringThread extends Thread {
    private StringBuilder str;

    public StringThread(StringBuilder str) {
        this.str = str;
    }

    @Override
    public void run() {
        synchronized (str) {
            for (int i = 0; i <= 100; i++) {
                System.out.print(str);
            }
            System.out.println(" " + Thread.currentThread().getName());
            char c = str.charAt(0);
            str.setCharAt(0, ++c);
        }
    }
}
