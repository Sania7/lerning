package exeption;

/**
 * 0.2. Кидаем исключение - throw new RuntimeException
 * java.lang.IllegalArgumentException - метод вызывает с не корректными параметрами.
 * java.lang.IllegalStateException - метод вызывается с объекта в не корректном состоянии.
 * java.lang.NullPointerException - методы вызывается у переменной, которая инициализирована null ссылкой.
 */
public class Fact {
    public static void main(String[] args) {
    }
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N must not be less than 0.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
