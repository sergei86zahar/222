package _Java8._Глава_15.SpecialistTV_1;
import ITVDN.JavaDoc.Person;

import java.util.ArrayList;
import java.util.List;
public class Program {
    public static void main(String[] args) {



        List<Persons> persons = new ArrayList<>();
        persons.add(new Persons("Сергей", 38));
        persons.add(new Persons("Даша", 7));
        persons.add(new Persons("Глаша", 3));
        persons.add(new Persons("Саша", 6));
        persons.add(new Persons("Анна", 18));
        persons.stream().filter(p -> p.getAge() >= 18
        ) .forEach(System.out::println);
        persons.stream().forEach(System.out::println);

    }
}
class Persons {
    String name;
    int age;
    Persons(String s, int n) {
        String name = s;
        int age = n;
    }
    int getAge() {
        return age;
    }
}
