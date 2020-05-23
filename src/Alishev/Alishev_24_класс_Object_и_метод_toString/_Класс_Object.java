package Alishev.Alishev_24_класс_Object_и_метод_toString;
public class _Класс_Object {
    public static void main(String[] args) {
        Hum h1 = new Hum("Bob", 40);
        System.out.println(h1);
    }
}
class Hum {
    private String name;
    private int age;
    public Hum(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {  /* Этот метод возвращает Хэш-Код объекта. Переопределили
    метод toString для объекта h1, который применяется к объкту по-умолчанию, потому
    что все классы унаследованные от класса Object.*/
        return name + "," + age;
    }
}
