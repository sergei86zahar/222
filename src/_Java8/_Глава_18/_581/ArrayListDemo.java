package _Java8._Глава_18._581;
import java.util.ArrayList;
class ArrayListDemo {
    public static void main(String args[]) {
        long start, end;
        start = System.currentTimeMillis();  // Замер времени
        // Create an array list.
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Initial size of al: " + al.size());
        // Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " + al.size());
        // Display the array list.
        System.out.println("Contents of al: " + al);
        // Remove elements from the array list.
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
        end = System.currentTimeMillis();  // Замер времени
        System.out.println("Elapsed time: " + (end - start));
    }
}
