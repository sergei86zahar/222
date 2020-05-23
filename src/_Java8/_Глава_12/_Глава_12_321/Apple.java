package _Java8._Глава_12._Глава_12_321;
public enum Apple {
   Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
   private int price; // цена яблока каждого сор та
   // Конструктор
   Apple (int p) {
      price = p;
   }
   int getPrice () {
      return price;
   }
}
class EnumDemo3 {
   public static void main (String[] args) {
      Apple ap;
      // вывести цену яблока сорта Winesap
      System.out.println("Яблоко сорта Winesap стоит " + Apple.Winesap.getPrice() + " " + "центов. \n");
      // вывести цены на все сорта яблок
      System.out.println("Цены на все сорта яблок: ");
      for (Apple a : Apple.values()) {
         System.out.println(a + " стоит " + a.getPrice() + " центов.");
      }
   }
}
