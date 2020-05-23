package Alishev.Generics;
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        List<Animal> gg = new ArrayList<>(); //Мы создали объект класса ArrayList
        // который может хранить только объекты класса Animal
        gg.add(new Animal(1));
        gg.add(new Animal(2));
        test(gg);
        List<Dog> LKL = new ArrayList<>();
        LKL.add(new Dog(33));
        LKL.add(new Dog(66));
        test1(gg);
    }
    private static void test(List<Animal> list) { // Принимает в чачестве аргумента
        // объекты класса List и производит операции с этими объектами в цикле for,
        // помещает каждый объект поочереди в переменную NN, и выводим эту переменную
        // NN на экран.
        for (Animal NN : list) {
            System.out.println(NN);
        }
    }
    private static void test1(List<? extends Animal> list) {// Вот так теперь можно
        // поставлять в этот метод "листы" класса Animal или любого другого класса
        // каторый наследует Animal, то есть в нашем случае Dog.
        for (Animal NN : list) {
            NN.eat();
        }
    }
}
