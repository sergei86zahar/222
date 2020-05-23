package _Java8._Глава_9._Глава_9_интерфейсы_2_;
public class TestIface {
   public static void main (String[] args) {
      Callback c = new Client(); // переменная интерфейсной ссылки может обращаться к
      // объекту реализации. Переменной "с" доступны ТОЛЬКО методы интерфейса
      // реализованные в классе Client.
      Callback ob = new AnotherClient();
      c.callback(42);
      c = ob; //  c - теперь ссылается на объект AnotherClient.
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
      System.out.println("квадрат p равен " + (p * p));
   }
}
class AnotherClient implements Callback {
   @Override
   public void callback (int p) {
      System.out.println("другая версия callback");
      System.out.println("квадрат p равен " + (p * p));
   }
}
