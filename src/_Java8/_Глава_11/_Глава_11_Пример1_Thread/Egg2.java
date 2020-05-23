package _Java8._Глава_11._Глава_11_Пример1_Thread;
import java.util.Random;
class Egg2 extends Thread {
   public void run () {
      for (int i = 0; i < 5; i++) {
         try {
            sleep(ChickenEgg1.getTimeSleep1());
            System.out.println("Новый поток " + i);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}
class ChickenEgg1 {
   public static int getTimeSleep1 () {
      Random random = new Random();
      int a = random.nextInt(1000);
      if (a < 10) {
         a *= 100;
      } else if (a < 100) {
         a *= 10;
      }
      return a;
   }
   public static void main (String[] args) {
      Egg2 egg2 = new Egg2();
      egg2.start();
      for (int i = 0; i < 5; i++) {
         try {
            Thread.sleep(getTimeSleep1());
            System.out.println("Главеый поток " + i);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      if (egg2.isAlive()) {
         try {
            egg2.join();
            System.out.println("Яйцо победило");
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      } else System.out.println("Курица победила");

   }
}
