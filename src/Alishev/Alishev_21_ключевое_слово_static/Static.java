package Alishev.Alishev_21_ключевое_слово_static;
public class Static {
    public static void main(String[] args) {
        HumanL h1 = new HumanL("Bob", 40);
        HumanL h2 = new HumanL("Tom", 30);
        HumanL.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        HumanL.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();
    }
}
class HumanL {
    private String name;
    private int age;
    public static String description;  /* свойства static заключаются в том, что она делает переменную или метод общим одним для всех объектов*/
    public HumanL(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void getAllFields() {
        System.out.println(name + "," + age + "," + description);
    }
}
