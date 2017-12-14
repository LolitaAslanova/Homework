package lesson9.studentAspirant;

/**
 * Урок 9, задание 2
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant,
 * аспирант отличается от студента наличием некой научной работы.
 * Создать переменную типа Student, которая ссылается на объект типа Aspirant.
 * Урок 10, задание 1
 * Создать метод getScholarship() для класса Student. Переопределить его в классе Aspirant.
 * Создать массив типа Student, содержащий объекты класса Student и Aspirant.
 * Вызвать метод getScholarship() для каждого элемента массива.
 */

public class StudentAspirant {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(454);
        students[1] = new Aspirant(644);
        students[2] = new Aspirant(540);

        for (Student s : students) {
            s.getScholarship();
            System.out.println(s.getScholarship());
        }
    }
}
