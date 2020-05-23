package _Java8._Глава_8._Глава_8_ИерархияВызоваКонстр;
public class CallingCons {
    public static void main(String[] args) {
        // Демонстрирует порядок вызова конструкторов
        C c = new C();
    }
}
// Создать суперкласс А
class A {
    A() {
        System.out.println("Внутри А-конструктора.");
    }
}
// Создать подкласс В расширением А
class B extends A {
    B() {
        System.out.println("Внутри В-конструктора.");
    }
}
// Создать другой класс С, расширяющий В
class C extends B {
    C() {
        System.out.println("Внутри С-конструктора.");
    }
}
