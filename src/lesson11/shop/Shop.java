/**
 * Урок 11, задание 1
 * Определить интерфейс Printable, содержащий метод  void print().
 * Определить класс Book, реализующий интерфейс Printable.
 * Определить класс Magazine, реализующий интерфейс Printable.
 * Создать массив типа Printable, который будет содержать книги и журналы.
 * В цикле пройти по массиву и вызвать метод print для каждого объекта.
 * Создать статический метод printMagazines(Printable[] printable), который выводит на консоль названия только журналов.
 * Создать статический метод printBooks(Printable[] printable), который выводит на консоль названия только книг.
 * Используем оператор instanceof.
 */

package lesson11.shop;

public class Shop {
    public static void main(String[] args) {
        Printable[] papers = new Printable[2];
        papers[0] = new Book();
        papers[1] = new Magazine();
        Book.printBooks();
        Magazine.printMagazines();
        for (Printable paper : papers) {
            if (paper instanceof Book){
                System.out.println(paper);
            }
            if (paper instanceof Magazine){
                System.out.println(paper);
            }
            paper.print();
        }
    }
}
