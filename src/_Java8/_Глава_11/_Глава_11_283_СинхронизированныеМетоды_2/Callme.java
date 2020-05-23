package _Java8._Глава_11._Глава_11_283_СинхронизированныеМетоды_2;
public class Callme {
    synchronized void call(String msg) { // Это предохраняет потоки от ввода call(),
        // пока его использует другой поток.
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прерывание");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        target.call(msg);
    }
}
class Synch {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Привет");
        Caller ob2 = new Caller(target, "Синхронизированный");
        Caller ob3 = new Caller(target, "Мир");
        // ждать завершения потоков
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание");
        }
    }
}
