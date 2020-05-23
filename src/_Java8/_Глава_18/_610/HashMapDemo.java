package _Java8._Глава_18._610;
import java.util.*;
class HashMapDemo {
    public static void main(String args[]) {
        // Create a hash map.
        HashMap<String, Double> hm = new HashMap<>();
        // Put elements to the map
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);
        // Get a set of the entries. получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        // Display the set. вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");  // Возвращает ключ данной записи из
            // отображения
            System.out.println(me.getValue());  // Возвращает значение данной зап иси из отображения
        }
        System.out.println();
        // Deposit 1000 into John Doe's account. внести сумму 1000 на счет Джона Доу
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
    }
}
