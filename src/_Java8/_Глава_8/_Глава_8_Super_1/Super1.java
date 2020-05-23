package _Java8._Глава_8._Глава_8_Super_1;
public class Super1 {
    public static void main(String[] args) {
        B subClass = new B(1, 2);
        subClass.show();
    }
}
class A {
    int i;
}
class B extends A {
    int i; // имя переменной совпадает и скрывает переменную i в классе А
    B(int a, int b) {
        super.i = a; // обращаемся к переменной i из класса А
        i = b; // обращаемся к переменной i из класса В
    }
    void show() {
        System.out.println("i из суперкласса: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}
