package _Java8._Глава_8._Глава_8_ПерегрузкаМетодов;
public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show("Это k: "); // здесь вызывается show() из В
        subOb.show(); // здесь вызывается show() из A
    }
}
class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String m) {
        System.out.println(m + k);
    }
}
// Версия show() в классе В имеет строчный параметр. Это делает сигнатуру его типов
// отличной от класса А, который не имеет никаких параметров. Поэтому никакого
// переопределения (или скрытия имени) нет.
