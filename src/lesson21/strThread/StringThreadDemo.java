package lesson21.strThread;

public class StringThreadDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("a");
        StringThread thread0 = new StringThread(s);
        StringThread thread1 = new StringThread(s);
        StringThread thread2 = new StringThread(s);

        thread0.start();
        thread1.start();
        thread2.start();
    }
}
