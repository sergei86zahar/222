package _Java8._Глава_9._Глава_9_Интерфейс_1;
class Client implements Callback {
   // Реализация Callback-интерфейса
   @Override
   public void callback (int param) {
      System.out.println("callback вызван с аргументом " + param);
   }

}
class TestIface {
   public static void main (String[] args) {
      Callback c = new Client();  // что переменной c, объявленной с типом интерфейса
      // Callback, был назначен экземпляр класса client
      c.callback(42);
   }
}
interface Callback {
   void callback (int param);
}
