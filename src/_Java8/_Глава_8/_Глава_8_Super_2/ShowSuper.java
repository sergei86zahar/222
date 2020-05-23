package _Java8._Глава_8._Глава_8_Super_2;
public class ShowSuper {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        // суперкласс может быть использован сам по себе
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое superOb: ");
        superOb.showij();
        System.out.println();
        // Подкласс имеет доступ ко всем public-членам его суперкласса
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println("Сумма i, j, k в subOb: ");
        subOb.sum();
    }
}
class A {
    int i, j;
    void showij() {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B extends A {
    int k;
    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i + j + k: " + (i+j+k));
    }
}
