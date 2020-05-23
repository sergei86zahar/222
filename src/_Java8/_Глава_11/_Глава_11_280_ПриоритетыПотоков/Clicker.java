package _Java8._Глава_11._Глава_11_280_ПриоритетыПотоков;
public class Clicker implements Runnable {
    int click = 0;
    Thread t;
    private volatile boolean running = true;
    public Clicker(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }
    public void run() {
        while (running) {
            click++;
        }
    }
    public void stop() {
        running = false;
    }
    public void start() {
        t.start();
    }
}
class HiLoPri {
    public static void main(String args[]) {
        /*
        Несмотря на то, что главный поток создаётся автоматически,  им можно управлять
        через объект класса Thread. Для этого нужно вызвать метод currentThread(),
        после чего можно управлять потоком.
        Для установки приоритета потока используйте метод setPriority(),  который
        является членом класса Thread.
        Значение параметра level должно быть в  пределах диапазона min priority и
        max_priority. В настоящее время эти значения равны 1 и 10, соответственно.
        Чтобы вернуть потоку приоритет,  заданный по умолчанию, определите
        norm_priority, который в настоящее время равен 5.  Эти приоритеты определены в
        Thread как final-переменны
         */
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
        lo.start();  // старт потока
        hi.start();  // старт потока
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока.");
        }
        lo.stop();
        hi.stop();
        // Ждать завершения дочерних потоков.
        try {
            hi.t.join();
            lo.t.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Поток с низким приоритетом: " + lo.click);
        System.out.println("Поток с высоким приоритетом: " + hi.click);
    }
}
