package _Java8._Глава_11._Глава_11_Пример5_daemon;
class Store2 {
   int a;
   Store2 (int a) {
      this.a = a;
   }
   public synchronized void get () {
      while (a < 1) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      a--;
      System.out.println("-1 товар на складе");
      System.out.println("Товаров на складе       " + a);
      notify();
   }
   public synchronized void put () {
      while (a >= 4) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      a++;
      System.out.println("+1 товар на складе");
      System.out.println("Товаров на складе       " + a);
      notify();
   }
}
class Producer2 implements Runnable {
   Store2 store2;
   Producer2 (Store2 store2) {
      this.store2 = store2;
   }
   @Override
   public void run () {
      for (int i = 0; i < 5; i++) {
         store2.put();
      }
   }
}
class Consumer2 implements Runnable {
   Store2 store2;
   Consumer2 (Store2 store2) {
      this.store2 = store2;
   }
   @Override
   public void run () {
      for (int i = 0; i < 7; i++) {
         store2.get();
      }
   }
}
class Trade {
   public static void main (String[] args) {
      Store2 store2 = new Store2(3);
      Producer2 producer = new Producer2(store2);
      Consumer2 consumer = new Consumer2(store2);
//		new Thread(producer).start();
//		new Thread(consumer).start();
      Thread tp = new Thread(producer);
      Thread tc = new Thread(consumer);
      tp.setDaemon(true);
      tc.setDaemon(true);
      tp.start();
      tc.start();
      try {
         Thread.sleep(100);
      } catch (InterruptedException e) {
      }
      System.out.println("\nГлавный поток завершен\n");
      System.exit(0);
   }
}
