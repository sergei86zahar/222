package _Java8._Глава_18._619;
// использовать компаратор для сортировки счетов  по фамилиям в кладчиков
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
// Compare last whole words in two strings. сравнить последние слова  в обеих
// символьных строках
class TComp implements Comparator<String> {
    public int compare(String a, String b) {
        int i, j, k;
        String aStr, bStr;
        aStr = a;
        bStr = b;
        // Find index of beginning of last name. найти индекс символа,  с которого
        // начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) // last names match, check entire name/   Фамилии совпадают,
            // проверить имя и фамилию полностью
            return aStr.compareTo(bStr);
        else
            return k;
    }
    // No need to override equals.
}
class TreeMapDemo2 {
    public static void main(String args[]) {
        // Create a tree map. создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());
        // Put elements to the map.
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
