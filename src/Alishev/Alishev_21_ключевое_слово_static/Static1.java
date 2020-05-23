package Alishev.Alishev_21_ключевое_слово_static;
public class Static1 {
    public static void main(String[] args) {
        HumanNN Ser = new HumanNN("Bob", 40);
        HumanNN Gip = new HumanNN("Tom", 30);
        Ser.printNumberOfPeople();
        Gip.printNumberOfPeople();
        HumanNN Oleg = new HumanNN("Oleg", 20);
        Ser.printNumberOfPeople();
        Gip.printNumberOfPeople();
        Oleg.printNumberOfPeople();
    }
}
class HumanNN {
    private String name;
    private int age;
    private static int countPeople;
    public HumanNN(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}
