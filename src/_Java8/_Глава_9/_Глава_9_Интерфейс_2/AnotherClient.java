package _Java8._Глава_9._Глава_9_Интерфейс_2;
class AnotherClient implements Callback {
    // Другая реализация Callback-интерфейса
    @Override
    public void callback(int param) {
        System.out.println("callback вызван с аргументом " + param);
        System.out.println("Квадрат р равен " + (param + param));
    }
}
class Client implements Callback {
    // Реализация Callback-интерфейса
    @Override
    public void callback(int param) {
        System.out.println("callback вызван C аргументом " + param);
    }
}
class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();  // что переменной C, объявленной с типом интерфейса
        // Callback, был назначен экземпляр класса client
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;  // С теперь ссылается на объект AnotherClient
        c.callback(42);
    }
}
interface Callback {
   void callback(int param);
}
