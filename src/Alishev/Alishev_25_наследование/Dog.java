package Alishev.Alishev_25_наследование;
public class Dog extends Animal { // слово  extends обозначает наследование
    void bark() {
        System.out.println("I am barking");
    }
    void eat() {
        System.out.println("Dog is eating");
    }
    void showName() {
        System.out.println(name);
    }
}
