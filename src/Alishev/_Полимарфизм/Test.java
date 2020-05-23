package Alishev._Полимарфизм;
public class Test {
    public static void main(String[] args) {
        Animal an = new Animal();
        Dog D = new Dog();
        Cat cat = new Cat();
        an.eat();
        D.eat();
        /*
        Можно обращаться к классу Dog  через переменную класса Animal
         */
        Animal fax = new Dog();// Upcasting - Восходящее преобразование.
        fax.eat();
        Dog vv = (Dog)new Animal();// Downcasting - Нисходящее преобразование.(Небезопано)
        /*
        Мы можем вызвать метод test у всех объектов потому что они унаследованы он Animal.
         */
        test(an);
        test(D);
        test(cat);
    }
    public static void test(Animal animal) {
        animal.eat();
    }
}
