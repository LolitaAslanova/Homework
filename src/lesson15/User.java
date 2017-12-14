package lesson15;

/**
 * Урок 15, задание 1
 * Создать класс User, содержащий private переменные login, password.
 * Создать внутренний класс Query в классе User.
 * Класс Query содержит метод printToLog(), который распечатывает на консоль сообщение о том
 * что пользователь с таким то логином и паролем отправил запрос. Класс User, содержит метод createQuery(),
 * в котором создается объект класса Query и вызывается метод printToLog().
 * В методе main(): создать экземпляр класса User и вызвать метод createQuery();
 * создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
 * создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
 */

public class User {
    private String login;
    private String password;

    private class Query {
        public void printToLog(String login, String password) {
            System.out.println("Пользователь с логином " + login + " и с паролем " + password + " отправил запрос");
        }
    }

    public void createQuery() {
        Query query = new Query();
         query.printToLog(login, password);
    }

    static public void main(String[] args) {
        User user1 = new User();
        Query user2 = new User().new Query();
        user2.printToLog("MyLog", "MyPass");
        System.out.println(user1 + "" + user2);
    }
}
