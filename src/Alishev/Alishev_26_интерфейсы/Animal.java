package Alishev.Alishev_26_интерфейсы;
class Animal implements Info {
    /*
    Здесь указанно что этот класс реализовывает интерфейс  Info. Класс может
    реализовывать любое колличество интерфейсов через запятую. Если класс реализует
    интерфейс это значит что он обязан использовать все метобы этого интерфейса.
     */
    public int id;
    public Animal(int id) {
        this.id = id;
    }
    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
