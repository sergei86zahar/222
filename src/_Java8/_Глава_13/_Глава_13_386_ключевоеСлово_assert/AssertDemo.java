package _Java8._Глава_13._Глава_13_386_ключевоеСлово_assert;
import static java.lang.System.*;
public class AssertDemo {
    static int val = 3;
    // возвратить целочисленное значение
    static int getnum() {
        return val--;
    }
    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getnum();
            assert n > 0 : "n отрицательное!"; // не подтвердится, если n == 0
            out.println("n равно " + n);
        }
    }
}
