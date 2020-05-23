package _Java8._Глава_18._621;
import java.lang.ref.SoftReference;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class CompLastNames implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i, j;
        // Find index of beginning of last name. найти индекс символа,  с которого
        // начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}
class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        // Comparator<String> FDFDF = compLN.thenComparing(new CompThenByFirstName());
        Comparator<String> FDFDF = compLN.thenComparing((a, b) -> a.compareToIgnoreCase(b));
        TreeMap<String, Double> tm = new TreeMap<>(FDFDF);
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);
        tm.put("Jabe Baker", 355.66);
        // Get a set of the entries. получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        // Display the elements. вывести элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // Deposit 1000 into John Doe's account.
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}
