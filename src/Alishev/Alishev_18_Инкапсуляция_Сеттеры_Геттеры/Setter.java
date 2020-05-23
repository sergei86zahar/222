package Alishev.Alishev_18_Инкапсуляция_Сеттеры_Геттеры;
public class Setter {
    public static void main(String[] args) {
        Person1 Sergey = new Person1();
        Sergey.setName("какое-то имя");
        Sergey.setAge(21);
        System.out.println("выводим значения в main методе: " + Sergey.getName());
        System.out.println("выводим значение в main методе: " + Sergey.getAge());
    }
}
class Person1 {
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("возрост должен бытьположительным");
        } else {
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isEmpty()) { // этот метод проверяет ввёл ли ты пустое имя
            System.out.println("ты ввёл пустое имя");
        } else {
            this.name = name;
        }
    }
    private String name;
    private int age;
}
