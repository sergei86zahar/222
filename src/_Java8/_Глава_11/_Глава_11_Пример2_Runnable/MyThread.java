package _Java8._Глава_11._Глава_11_Пример2_Runnable;


class MyThread implements Runnable {
    Thread thread;
    MyThread(){
       thread = new Thread(this,"Новый поток");
       System.out.println("создан новый поток " + thread.getName());
       thread.start();
    }
    @Override
    public void run() {
        for (int i  =0; i<5; i++){
           System.out.println("Новый поток" + i);
           try {
              Thread.sleep(500);
           } catch (InterruptedException e) {
              e.printStackTrace();
           }
        }
       System.out.println("Новый поток завершён");
    }
}

class RunnableExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        for (int i =0;i<5; i++){
           try {
              Thread.sleep(600);
              System.out.println("Главный поток" + i);
           } catch (InterruptedException e) {
              e.printStackTrace();
           }
        }
       System.out.println("Главный поток завершён");
    }
}
