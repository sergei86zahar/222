package _Java8._Глава_10._Глава_10_Оператор_throw;
public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Захват внутри demoproc");
            throw e;  // повторный выброс исключения
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный захват: " + e);
        }
    }
}
