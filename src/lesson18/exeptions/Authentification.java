package lesson18.exeptions;

/**
 * Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
 * Login должен содержать только латинские буквы, цифры и знак подчеркивания.
 * Длина login должна быть меньше 20 символов.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Password должен содержать только латинские буквы, цифры и знак подчеркивания.
 * Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами –
 * один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Обработка исключений проводится внутри метода. Используем multi-catch block.
 * Метод возвращает true, если значения верны или false в другом случае.
 */

public class Authentification {
    public static void main(String[] args) {
        System.out.println(isCorrect("login1", "password1", "password1"));
        System.out.println(isCorrect("login1login1login1login1login1", "password1", "password1"));
        System.out.println(isCorrect("login1", "password1password1password1password1password1",
                "password1password1password1password1password1"));
        System.out.println(isCorrect("login1", "password1", "password2"));
        System.out.println(isCorrect("login1login1login1login1login1login1",
                "password1password1password1password1password1", "password1password1password1password1password1"));

        System.out.println("This is the end.");
    }

    public static boolean isCorrect(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Nepravilnyi login");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Nepravilnyi parol");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            System.out.println(login);
            System.out.println(password);
            System.out.println(confirmPassword);
        }
        return true;
    }
}
