package Alishev.Alishev_26_интерфейсы;
public class Test {
    public static void main(String[] args) {
        Animal an = new Animal(1);
        Person pe = new Person("Bob");
        an.showInfo();
        pe.showInfo();
        /*
        Можно создать объект Info (объект интерфейса) от каждлол класса ели эти классы
        реализуют этот интерфейс.
         */
        Info info1 = new Animal(1);
        Info info2 = new Person("Tim");
        /*
        Мы имеим доступ только к методам интерфейса и не можем вызвать методы классов
        Animal и Person для объектов info1 и info2.
         */
        info1.showInfo();
        info2.showInfo();
        /*
        Вызовем метод outputInfo и поместим ему в качестве аргумента объекты info1 и
        info2.
         */
        outputInfo(info1);
        outputInfo(info2);
    }
    public static void outputInfo(Info info) {
        /*
        Этому методу не важно какой объект будет помещём в качестве аргумента, а важно
        чтобы класс этого объекта реализовывал онтерфейс info.
         */
        info.showInfo();
    }
}
