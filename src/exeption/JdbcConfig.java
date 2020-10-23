package exeption;

/**
 * Объявления исключений в сигнатуре метода.
 * В Java есть ключевое слово throws. Его можно добавить после параметров метода и указать,
 * какие прерывания могут случиться с этим методом.
 * Через запятую можно указать несколько исключений.
 * В этом случае мы передаем ответственность за исключение коду, который будет использовать наш метод.
 */
public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
    }

    public static void main(String[] args) throws UserInputException {
        load("jdbc://localhost:8080");
    }
}
