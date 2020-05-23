package Alishev._Анонимные_классы_;
public class Test {
    public static void main(String[] args) {
       /*
       OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();

        */
       Animal animal = new Animal();
       animal.eat();
       Animal animal1 = new Animal() {  //  Таким образом мы переопределяем метод eat
           // (там за кулисами создаётся анонимный класс, наследник Animal)
           public void eat(){
               System.out.println("Other animal is eating...");
           }
       };  //  Нужно поставить точку с запятой
    }
}
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
/* Писать отдельный класс для того чтобы преопределить один метод не есть хорошо
/////////////////////////////////////////////////////
class OtherAnimal extends Animal { // Переопределяем метод в родителе
    public void eat() {
        System.out.println("Other animal is eating...");
    }
}
///////////////////////////////////////////////////////*/
