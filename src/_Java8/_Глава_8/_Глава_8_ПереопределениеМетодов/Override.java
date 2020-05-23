package _Java8._Глава_8._Глава_8_ПереопределениеМетодов;
public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show(); // здесь вызывается show() из В
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
    void show() {
        System.out.println("k: " + k);
    }
}
