package exeption;
/**
 * 0.3. Тестирование исключений с junit
 */

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calc() {
        new Fact().calc(-10);
    }
}