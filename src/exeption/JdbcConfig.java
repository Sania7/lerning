package exeption;

/**
 * Объявления исключений в сигнатуре метода.
 * В Java есть ключевое слово throws. Его можно добавить после параметров метода и указать,
 * какие прерывания могут случиться с этим методом.
 * Через запятую можно указать несколько исключений.
 * В этом случае мы передаем ответственность за исключение коду, который будет использовать наш метод.
 *
 * Конструкция try-catch.
 * Эта конструкция позволяет выполнить методы, которые могут прерваться с исключением и обработать эти исключения.
 * Мы убрали из сигнатуры объявление throws и обернули метод load в конструкцию try-catch.
 * Блок try содержит операторы, которые мы хотим выполнить.
 * Блок catch содержит объявление исключение. Если операторы в блоке try вызовут исключение UserInputException,
 * то программа перейдет к выполнению блока catch.
 * В блоке catch написан только один оператор.
 * e.printStackTrace();
 * Этот оператор выведет на консоль стек вызовов методов от начала программы до оператора, который вызвал прерывания.
 */
public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
    }

    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
