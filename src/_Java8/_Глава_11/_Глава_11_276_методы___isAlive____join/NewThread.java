package _Java8._Глава_11._Глава_11_276_методы___isAlive____join;
public class NewThread implements Runnable {
    // Использование join() для ожидания окончания потока.
    String name; // имя потока
    Thread t;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);  //  Создать новый поток.
        System.out.println("Новый поток: " + t);
        t.start(); // старт потока
    }
    // Это точка входа потока.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
class DemoJoin {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("Первый");
        NewThread ob2 = new NewThread("Второй");
        NewThread ob3 = new NewThread("Третий");
        System.out.println("Первый поток выполняется: " + ob1.t.isAlive());  //
        // возвращает true,  если поток, на котором он вызывается —  все еще
        // выполняется. В противном случае возвращается false.
        System.out.println("Второй поток выполняется: " + ob2.t.isAlive());
        System.out.println("Третий поток выполняется: " + ob3.t.isAlive());
        // ждатьзавершения потоков
        try {
            System.out.println("Ждите завершения потоков.");
            ob1.t.join();  // Этот метод ждет завершения потока, на котором он вызван.
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока");
        }
        System.out.println("Первый поток выполняется: " + ob1.t.isAlive());
        System.out.println("Второй поток выполняется: " + ob2.t.isAlive());
        System.out.println("Третий поток выполняется: " + ob3.t.isAlive());
        System.out.println("Завершение главного потока.");
    }
}

