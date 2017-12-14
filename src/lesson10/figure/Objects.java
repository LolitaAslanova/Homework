/**
 * Урок 10, задание 2
 * Создайте суперкласс Shape и его наследники Circle, Rectangle.
 * Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
 * В цикле нарисовать их (вызвать метод draw).
 * Добавить метод equals()  для классов Shape, Circle, Rectangle.
 */

package lesson10.figure;

public class Objects {
    public static void main(String[] args) {
        Shape[] objects = new Shape[2];
        objects[0] = new Circle("red", 3.5, 6.7);
        objects[1] = new Rectangle("blue", 4.2, 4.9);

        for (Shape object : objects) {
            System.out.println(object.draw());
            System.out.println(object);
        }
        System.out.println("Эквивалентен ли первый объект второму? " + objects[0].equals(objects[1]));
    }
}
