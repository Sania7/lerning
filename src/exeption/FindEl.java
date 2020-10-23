package exeption;
/**
 * 1. Создайте класс ru.job4j.ex.ElementNotFoundException. Класс должен наследоваться от java.lang.Exception.
 * 2. Допишите метод поиска индекса элемента в строковом массиве.
 * 3. Если элемента нет, то нужно выкинуть исключение ElementNotFoundException.
 * В сингатуре метода объявить это исключение.
 * 4. Добавьте метод main, и в нем вызовите метод indexOf. В методе main используйте конструкцию try-catch.
 */
public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundExeption {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundExeption("This element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"first", "second", "third"};
        try {
            indexOf(value, "www");
        } catch (ElementNotFoundExeption e) {
            e.printStackTrace();
        }
    }
}
