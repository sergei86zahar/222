package _Java8._Глава_11._Глава_11_Пример3_synchronized;
class Common {
   int a;
}
class XXX implements Runnable {
   final Common common;
   XXX (Common common) {
      this.common = common;
   }
   @Override
   public void run () {
      synchronized (common) {
         common.a = 1;
         for (int i = 0; i < 5; i++) {
            try {
               Thread.sleep(500);
               System.out.println(Thread.currentThread().getName() + " - " + common.a);
               common.a++;
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
      }
   }
}
class SynchronizedThread {
   public static void main (String[] args) {
      Common common = new Common();
      Thread t;
      for (int i = 1; i < 4; i++) {
         t = new Thread(new XXX(common), ("Поток " + i));
         t.start();
      }
   }
}


