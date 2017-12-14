package lesson21;

/**
 * Урок 21, задание 2
 * Создать класс NewThread расширяющий Thread.
 * Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
 * Создать экземпляр класса и запустить новый поток.
 *
 * В классе NewThread в цикле for вывести на консоль имя текущего потока.
 */

public class NewThreadDemo {
    public static void main(String[] args) {
        NewThread newThread0 = new NewThread();
        NewThread newThread1 = new NewThread();
        NewThread newThread2 = new NewThread();

        newThread0.start();
        newThread1.start();
        newThread2.start();
    }
}
