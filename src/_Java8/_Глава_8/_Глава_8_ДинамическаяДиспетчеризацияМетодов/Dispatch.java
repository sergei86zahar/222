package _Java8._Глава_8._Глава_8_ДинамическаяДиспетчеризацияМетодов;
public class Dispatch {
    public static void main(String[] args) {
        //  Происходит переопределение методов
        A a = new A();  // объект типа А
        B b = new B();  // объект типа В
        C c = new C();  // объект типа С
        A r;            // определить ссылку типа А
        r = a;          // r на А-объект
        r.callme();     // вызывает А-версию callme
        r = b;          // r указывает на В-объект
        r.callme();     // вызывает В-версию callme
        r = c;          // r указывает на С-объект
        r.callme();     // вызывает С-версию callme
    }
}
class A {
    void callme() {
        System.out.println("Внутри А метод callme");
    }
}
class B extends A {
    // переопределить callme()
    void callme() {
        System.out.println("Внутри В метод callme");
    }
}
class C extends A {
    // переопределить callme()
    void callme() {
        System.out.println("Внутри С метод callme");
    }
}
