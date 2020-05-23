package _Java8._Глава_8._Глава_8_final_дляМетодов_1;
public class A {
    final void meth() {
        System.out.println("это метод final");
    }
}
class B extends A {
    //void meth() {                      // Ошибка! Нельзя переопределить
    //    System.out.println("Ошибка!");
   // }
}
