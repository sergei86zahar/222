package _Java8._Глава_11._550;
// Demonstrate thread groups.
class NewThread extends Thread {
    boolean suspendFlag;
    NewThread(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
        System.out.println("New thread: " + this);
        suspendFlag = false;
        start(); // Start the thread
    }
    // This is the entry point for thread.
    public void run() {
        try {
            for (int i = 6; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait(); /*
                        вынуждает вызывающий поток исполнения уступить монитор и
                        перейти в состояние ожидания до тех пор, пока какой-нибудь
                        другой поток исполнения не  войдет в тот же монитор и не
                        вызовет метод notify () .
                        */
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in " + getName());
        }
        System.out.println(getName() + " exiting.");
    }
    synchronized void mysuspend() {
        suspendFlag = true;
    }
    synchronized void myresume() {
        suspendFlag = false;
        notify(); /*
        возобновляет исполнение потока,  из которого был вызван метод wait () для
        того же самого объекта
        */
    }
}
class ThreadGroupDemo {
    public static void main(String args[]) {
        /*
        Группы потоков исполнения позволяют управлять ими как единым целым. Это
        оказывается особенно важно в тех случаях, когда требуется приостановить  или
        про­должить выполнение многих взаимосвязанных потоков исполнения
         */
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");
        NewThread ob1 = new NewThread("One", groupA);
        NewThread ob2 = new NewThread("Two", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Four", groupB);
        System.out.println("\nBывoд из метода list():");
        groupA.list(); // Печатает информацию об  этой группе потоков в стандартный
        // вывод. Этот метод полезен только для отладки.
        groupB.list();
        System.out.println();
        System.out.println("Пpepывaeтcя Группа A");
        Thread tga[] = new Thread[groupA.activeCount()]; //Возвращает оценку
        // количества активных потоков в этой группе потоков и ее подгруппах.
        // Рекурсивно перебирает все подгруппы в этой группе потоков.
        System.out.println(groupA.activeCount());
        groupA.enumerate(tga);// get threads in group/ получить потоки исполнения из
        // группы
        System.out.println(groupA.enumerate(tga));
        for (int i = 0; i < tga.length; i++) {
            ((NewThread) tga[i]).mysuspend(); // suspend each thread/   приостановить
            // каждый поток исполнения
        }
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток исполнения прерван.");
        }
        System.out.println("Boзoбнoвлeниe Группы A");
        for (int i = 0; i < tga.length; i++) {
            ((NewThread) tga[i]).myresume(); // resume threads in group.  возобновить
            // все потоки исполнения в группе
        }
        // wait for threads to finish
        try {
            System.out.println("Oжидaниe завершения потоков исполнения.");
            /*
            В классе Thread имеется метод join (), который применяется чаще,  чем метод
            isAlive (), чтобы дождаться завершения потока исполнения.
             */
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Exception in Main thread");
        }
        System.out.println("Глaвный поток исполнения завершен.");
    }
}
