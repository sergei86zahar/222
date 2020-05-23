package _Java8._Глава_11._Глава_11_Пример4_wait;
import java.util.Random;
/*
  Рассмотрим пример «Производитель-Склад-Потребитель»
  (Producer-Store-Consumer).  Пока производитель не поставит на склад
  продукт, потребитель не может его забрать.  Допустим производитель должен
  поставить 5 единиц определенного товара.  Соответственно потребитель должен
   весь товар получить.  Но, при этом, одновременно на складе может
   находиться не более 3 единиц товара.  При реализации данного примера
   используем методы wait () и notify().
 */
public class Store {
   int a;
   Store (int a) {
      this.a = a;
   }
   public synchronized void get () {
      while (a <= 0) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      a--;
      System.out.println("-1 Товар на складе");
      System.out.println("Остаток на складе  " + a);
      notify();
   }
   public synchronized void put () {
      while (a >= 5) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      a++;
      System.out.println("+1 Товар на складе");
      System.out.println("Остаток на складе  " + a);
      notify();
   }
}
class Producer implements Runnable {
   Store store;
   Producer (Store store) {
      this.store = store;
   }
   @Override
   public void run () {
      for (int i = 0; i < 11; i++) {
         store.put();
      }
   }
}
class Consumer implements Runnable {
   Store store;
   Consumer (Store store) {
      this.store = store;
   }
   @Override
   public void run () {
      for (int i = 0; i < 11; i++) {
         store.get();
      }
   }
}
class Trade {
   public static void main (String[] args) {
      Random random = new Random();
      int b = random.nextInt(10);
      Store store = new Store(b);
      new Thread(new Consumer(store)).start();
      new Thread(new Producer(store)).start();
   }
}
