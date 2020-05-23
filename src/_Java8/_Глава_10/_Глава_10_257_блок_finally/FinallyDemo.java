package _Java8._Глава_10._Глава_10_257_блок_finally;
public class FinallyDemo {
    // Выход из метода через исключение.
    static void procA() {
        try {
            System.out.println("Внутри procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally для procA ");
        }
    }
    // Возврат изнутри try-блока.
    static void procB() {
        try {
            System.out.println("Внутри procB");
            return;
        } finally {
            System.out.println("finally для procB ");
        }
    }
    // Нормальное выполнение try-блока.
    static void procC() {
        try {
            System.out.println("Внутри procC");
        } finally {
            System.out.println("finally procC");
        }
    }
    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение выброшено");
            procB();
            procC();
        }
    }
}
