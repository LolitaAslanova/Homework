/**
 * Урок 11, задание 4
 * Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
 * Интерфейс Инструмент содержит метод play() и клавишу String KEY = "До мажор".
 * Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
 * Создать массив типа Инструмент, содержащий инструменты разного типа.
 * В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
 * "Играет такой-то инструмент c такими то характеристиками".
 */

package lesson11.instrument;

public class MainClass {
    public static void main(String[] args) {
        Tool[] instr = new Tool[3];
        instr[0] = new Guitar(7);
        instr[1] = new Drum("Medium");
        instr[2] = new Trumpet(4);
        for (Tool instrument : instr) {
            System.out.println(instrument);
            instrument.play();
        }
    }
}
