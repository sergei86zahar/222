package _Java8._Глава_18._583;
// Convert an ArrayList into an array.
import java.util.*;
class ArrayListToArray {
    public static void main(String args[]) {
        // Create an array list.
        ArrayList<Integer> al = new ArrayList<>();
        // Add elements to the array list.
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Contents of al: " + al);
        System.out.println(al.size());
        // Get the array. получить обычный массив
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);  // преобразовать коллекцию типа ArrayList в массив
        int sum = 0;
        // Sum the array.
        for (int i : ia)
            sum += i;
        System.out.println("Sum is: " + sum);
        /*
        коллекции могут содержать только ссылки,  а не значения примитивных типов. Но
        автоматическая упаковка позволяет передавать методу add ( ) значения типа int,
         не прибегая к необходимости заключать их в оболочку типа Integer,  как это
         демонстрируется в данной программе.  Таким образом, автоматическая упаковка
         ощутимо облегчает сохранение в коллекциях значений примитивных типов.
         */
    }
}
