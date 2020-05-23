package _Java8._Глава_11._Глава_11_287_МежпоточныеСвязи_2;
public class Q {
    int n;
    boolean valueSet = false;
    synchronized void get() {
        if (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException выброшено");
            }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
    }
    synchronized void put(int n) {
        if (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException выброшено");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Отдано: " + n);
        notify();
    }
}
class Producer implements Runnable {
    Q q;
    Producer(Q f) {
        this.q = f;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable {
    Q q;
    Consumer(Q a) {
        this.q = a;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while (true) {
            q.get();
        }
    }
}
class PC {
    public static void main(String args[]) {
        Q x = new Q();
        new Producer(x);
        new Consumer(x);
        System.out.println("Для прерывания нажмите Control-C.");
    }
}
