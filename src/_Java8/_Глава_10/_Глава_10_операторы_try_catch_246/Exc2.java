package _Java8._Глава_10._Глава_10_операторы_try_catch_246;
public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {        // контролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет напечатано");
        } catch (ArithmeticException e) {     // перехватить ошибку деления на ноль
            System.out.println("Деление на ноль");
        }
        System.out.println("После оператора catch");
    }
}
