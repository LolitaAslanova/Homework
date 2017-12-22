/**
 * Урок 12, задание 1
 * Создать перечисление, содержащее названия времен года.
 * Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
 * Добавить конструктор принимающий на вход среднюю температуру.
 * Создать метод getDescription, возвращающий строку “Холодное время года”.
 * Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
 * В цикле распечатать все времена года, среднюю температуру и описание времени года.
 * Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
 * Создать метод, который принимает на вход переменную созданного вами enum типа.
 * Если значение равно Лето, выводим на консоль “Я люблю лето” и т.д. Используем оператор switch.
 */

package lesson12.weather;

public class FavouriteSeas {
    public static void main(String[] args) {
        Seasons favorite = Seasons.AUTUMN;
        System.out.println(favorite);
        seas(favorite);
        Seasons season;
        System.out.println();
        System.out.println("Времена года и средняя температура: ");
        Seasons[] seasonses = Seasons.values();
        for (Seasons s : seasonses) {
            System.out.println(s + " " + s.getTemperature());
            s.getDescription();
        }
        season = Seasons.valueOf("SUMMER");
        System.out.println("Seasons содержит " + season);

    }

    private static void seas(Seasons favorite) {
        switch (favorite) {
            case WINTER:
                System.out.println("Я люблю зиму.");
                break;
            case SPRING:
                System.out.println("Я люблю весну.");
                break;
            case SUMMER:
                System.out.println("Я люблю лето.");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень. ");
                break;
        }
    }
}
