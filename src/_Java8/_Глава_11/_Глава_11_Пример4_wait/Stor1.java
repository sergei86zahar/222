package _Java8._Глава_11._Глава_11_Пример4_wait;
class Store1 {
   int a = 0;
   public synchronized void get () {
      while (a < 1) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      a--;
      System.out.println("-1 Товар на складе.");
      System.out.println("Товаров на складе: " + a);
      notify();
   }
   public synchronized void put () {
      while (a >= 3) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      a++;
      System.out.println("+1 Товар на складе.");
      System.out.println("Товаров на складе: " + a);
      notify();
   }
}
class Producer1 implements Runnable {
   Store1 store1;
   Producer1 (Store1 store1) {
      this.store1 = store1;
   }
   @Override
   public void run () {
      for (int i = 1; i < 5; i++) {
         store1.get();
      }
   }
}
class Consumer1 implements Runnable {
   Store1 store1;
   Consumer1 (Store1 store1) {
      this.store1 = store1;
   }
   @Override
   public void run () {
      for (int i = 1; i < 5; i++) {
         store1.put();
      }
   }
}
class Trade1 {
   public static void main (String[] args) {
      Store1 tor = new Store1();
      Consumer1 consumer1 = new Consumer1(tor);
      Producer1 producer1 = new Producer1(tor);
      new Thread(consumer1).start();
      new Thread(producer1).start();
   }
}
