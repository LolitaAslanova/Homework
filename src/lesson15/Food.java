package lesson15;

/**
 * Создать интерфейс Cookable, содержащий метод void cook().
 * Создать класс Food, содержащий метод public void prepare(Cookable c) { c.cook(); }
 * Создать экземпляр класса Food и вызвать его метод prepare().
 * На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс Cookable.
 */

public class Food implements Cookable {
    @Override
    public void cook(){};

    public void prepare(Cookable c) { c.cook(); }

    public static void main(String[] args) {
        Food f1 = new Food();
        f1.prepare(f1);
        //System.out.println(prepare(f1));
    }
}
