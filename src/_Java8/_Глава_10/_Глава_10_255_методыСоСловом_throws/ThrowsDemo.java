package _Java8._Глава_10._Глава_10_255_методыСоСловом_throws;
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри throwOne.");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Выброс " + e);
        }
    }
}

