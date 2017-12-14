package lesson9;

/**
 * Урок 9, задание 4
 * Определить класс, хранящий такую информацию о пользователе библиотеки:
 * ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса. В программе организовать:
 * ввод данных о читателях,  вывод информации о читателях. Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг.
 * - takeBook, который будет принимать переменное количество названий книг.
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс).
 * Аналогичным образом перегрузить метод returnBook().
 */

public class Library {
    private String name;
    private int number;
    private String fakultet;
    private String birth;
    private long phone;

    public Library() {
    }

    public Library(String name, int number, String fakultet, String birth, int phone) {
        this.name = name;
        this.number = number;
        this.fakultet = fakultet;
        this.birth = birth;
        this.phone = phone;
    }

    private void takeBook(){
    }

    private void returnBook(){
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", fakultet='" + fakultet + '\'' +
                ", birth='" + birth + '\'' +
                ", phone=" + phone +
                '}';
    }

    public static void main(String[] args) {
        Library person1 = new Library("Max", 293726, "KIT", "20.05.1995", 984652874);
        Library person2 = new Library("Mihail", 293727, "KIT", "29.10.1995", 984656838);
        Library person3 = new Library("Lola", 293728, "KIT", "18.09.1996", 984639812);
        Library person4 = new Library("Ira", 293729, "KIT", "22.09.1996", 984653467);

       // for (Library p : Library)
    }
}
