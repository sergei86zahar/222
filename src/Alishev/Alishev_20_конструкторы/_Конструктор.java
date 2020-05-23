package Alishev.Alishev_20_конструкторы;
public class _Конструктор {
    public static void main(String[] args) {
        CarL Oleg = new CarL("Bob", 18);  //при создании можнорешить подставлять параметры или нет, и какие именно
        System.out.println("возрост Карла " + Oleg.getAge());
        System.out.println("имя человека "+ Oleg.getName());
    }
}
class CarL {
    private static int age;
    private String name;
    public CarL() {
        System.out.println("привет из первого конструктора");
    }
    public CarL(String name) {
        System.out.println("привет из второго конструктора");
        this.name = name;
    }
    public CarL(String name, int age) {
        System.out.println("привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public static int getAge() {
        return age;
    }
}
