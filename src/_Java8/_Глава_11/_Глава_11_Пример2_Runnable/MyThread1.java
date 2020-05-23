package _Java8._Глава_11._Глава_11_Пример2_Runnable;

public class MyThread1 implements Runnable {
    Thread thread;
    MyThread1() {
        thread = new Thread(this, "New thread");
        System.out.println("create new thread " + thread.getName());
        thread.start();

    }
    @Override
    public void run() {
        for(int i = 5; i>0;i--) {
            try {
                Thread.sleep(1000);
                System.out.println("new thread: " + i);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("new thread finaliz");

    }
}
class RunnableExample1 {
    public static void main(String[] args) {
        new MyThread1();
        for(int i = 5; i>0; i--) {
            try {
                Thread.sleep(1200);
                System.out.println("grand thread: " + i);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        } System.out.println("grand thread finaliz ");
    }
}
