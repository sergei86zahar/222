package _Java8._Глава_11._Глава_11_274_СозданиеМножественныхПотоков;
public class NewThrea implements Runnable {
    String name; // имя потока
    Thread t;
    NewThrea(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // старт потока
    }
    // Это точка входа для потока.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
/*
    Как видите, после запуска все три дочерних потока совместно используют CPU.  Обратите
    внимание на вызов sleep(10000) в main().  Он заставляет главный поток бездействовать в
    течение десяти секунд и гарантирует, что тот закончится последним.
 */
class MultiThreadDemo {
    public static void main(String args[]) {
        new NewThrea("Первый"); // старт потока
        new NewThrea("Второй");
        new NewThrea("Третий");
        try {
            // ждать завершения других потоков
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока.");
        }
        System.out.println("Завершение главного потока.");
    }
}
