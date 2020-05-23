package Alishev.Alishev_16_тип_возвращаемого_значенияя;
public class Class_введение {
    public static void main(String[] args) {
        Person Sergey = new Person();
        Sergey.name = "Sergey";
        Sergey.age = 50;
        Sergey.speak();
        Sergey.sayHello();
        Person Marina = new Person();
        Marina.name = "Marina";
        Marina.age = 20;
        Marina.speak();
        Marina.sayHello();
        Sergey.calculateYearsToRetirement();
        Marina.calculateYearsToRetirement();
        System.out.println(Sergey.yearsToRetirement());
        System.out.println(Marina.yearsToRetirement());
    }
}
class Person {
    String name;
    int age;
    int yearsToRetirement(){
        int yEArs = 65-age;
        return yEArs;
    }
    void calculateYearsToRetirement() {
        int years = 65 - age;
        System.out.println("колличество лет до пенсии: " + years);
    }
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("my name is " + name + "," + "I am " + age + " years old");
        }
    }
    void sayHello() {
        System.out.println("Hello");
    }
}
