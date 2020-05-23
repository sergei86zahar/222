package _Java8._Глава_8._Глава_8_АбстрактныйКласс_1;
public class AbstractDemo {
    public static void main(String[] args) {
        // Простая демонстрация абстракций Java.
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}
abstract class A {
    abstract void callme();
    // в абстрактных классах допустимы обычные методы
    void callmetoo() {
        System.out.println("Это конкретный метод");
    }
}
class B extends A {
    void callme() {
        System.out.println("В - реализация callme");
    }
}
