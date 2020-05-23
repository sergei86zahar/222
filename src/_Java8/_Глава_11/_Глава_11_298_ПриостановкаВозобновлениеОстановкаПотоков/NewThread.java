package _Java8._Глава_11._Глава_11_298_ПриостановкаВозобновлениеОстановкаПотоков;
public class NewThread implements Runnable {
    String name; // имя потока
    Thread t;
    boolean suspendFlag;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start(); // старт потока
    }
    // Это точка входа для потока.
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
    void mysuspend() {
        suspendFlag = true;
    }
    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
class SuspendResume {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("Первый");
        NewThread ob2 = new NewThread("Второй");
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка Первого потока");
            Thread.sleep(10000);
            ob1.myresume();
            System.out.println("Перезапуск Первого потока");
            ob2.mysuspend();
            System.out.println("Приостановка Второго потока");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Перезапуск Второго потока");
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока");
        }
        // ждать завершения потока
        try {
            System.out.println("Ждите завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока.");
            System.out.println("Завершение главного потока.");
        }
    }
}
