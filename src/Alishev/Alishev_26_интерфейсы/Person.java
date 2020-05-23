package Alishev.Alishev_26_интерфейсы;
class Person implements Info{
    String name;
    public Person(String name) {
        this.name = name;
    }
    void sayHello() {
        System.out.println("Hello");
    }
    @Override
    public void showInfo() {
        System.out.println("Name is "+this.name);
    }
}
