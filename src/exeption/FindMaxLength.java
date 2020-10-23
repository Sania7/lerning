package exeption;

/**
 * 0.1. java.lang.NullPointerException
 * Сделать проверку чтобы не падало исключение
 */
public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if (el != null && el.length() > max) { // проверка
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}
