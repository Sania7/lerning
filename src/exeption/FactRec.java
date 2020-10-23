package exeption;

/**
 * 0.6. Error - исключения, связанные с работой виртуальной машины
 */
public class FactRec {
    public static int calc(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return calc(n - 1) * n;
        }
    }
    public static void main(String[] args) {
        int a = 5;
        int rsl = calc(a);
        System.out.println(rsl);
    }
}
