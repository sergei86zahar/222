package _Java8._Глава_9._Глава_9_интерфейсы;
public class TestIface {
   public static void main (String[] args) {
      Callback c = new Client();
      c.callback(42);
   }
}
interface Callback {
   void callback (int p);
}
class Client implements Callback {
   @Override
   public void callback (int p) {
      System.out.println("callback вызван с аргументом " + p);
   }
}
