package lesson21;

/**
 * Урок 21, задание 1
 * Создать класс NewRunnable, реализующий интерфейс Runnable.
 * Переопределить run() метод.
 * Создать цикл for. В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка.
 * Используем статический метод Thread.sleep() чтобы сделать паузу.
 * Создать три потока, выполняющих задачу распечатки значений.
 */

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " "+ Thread.currentThread().getName());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();
        Thread thread0 = new Thread(newRunnable);
        Thread thread1 = new Thread(newRunnable);
        Thread thread2 = new Thread(newRunnable);

        thread0.start();
        thread1.start();
        thread2.start();
    }
}
