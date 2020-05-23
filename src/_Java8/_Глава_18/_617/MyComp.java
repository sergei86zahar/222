package _Java8._Глава_18._617;
import java.util.Comparator;
import java.util.TreeSet;
/*
// A reverse comparator for strings. Компаратор для сравнения символьных строк в обратном порядке
class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        // Reverse the comparison. выполнить сравнение в обратном порядке
        return bStr.compareTo(aStr);
    }
    // No need to override equals. переопределять метод equals () не требуется
}

 */
class CompDemo {
    public static void main(String args[]) {
        // Create a tree set. создать древовидное множество типа TreeSet
        // TreeSet<String> ts = new TreeSet<>(new MyComp());
        TreeSet<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        // Add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // Display the elements. вывести элементы из древовидного множества
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
