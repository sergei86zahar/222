package _Java8._Глава_11._Глава_11_271_интерфейс_Runnable_2;
public class NewThread extends Thread {
    NewThread() {
        // Создать новый, второй поток
        super("Demo Thread");
        System.out.println("Дочерний поток: " + this);
        start(); // стартовать поток
        /*
        Обратите внимание на обращение к методу super() внутри NewThread. Оно вызывает
        следующую форму конструктора Thread:
        public Thread (String threadName) где threadName определяет имя потока.
         */
    }
    // Это точка входа для второго потока.
    /*
    run () может вызывать другие методы,  использовать другие классы и объявлять
    переменные точно так же, как это делает главный (main) поток.
     */
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание дочернего потока.");
        }
        System.out.println("Завершение дочернего потока.");
    }
}
class ExtendThread {
    public static void main(String args[]) {
        new NewThread(); // создать новый поток
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока.");
        }
        System.out.println("Завершение главного потока.");
    }
}

