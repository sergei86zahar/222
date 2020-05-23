package _Java8._Глава_9._Глава_9_интерфейсы_3_НаПримереСтека;
public class IFTest_2 {
    public static void main(String[] args) {
        DynStack my1 = new DynStack(5);
        DynStack my2 = new DynStack(8);
        // эти циклы заставляют каждый стек расти
        for (int i = 0; i < 12; i++) {
            my1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            my2.push(i);
        }
        System.out.println("стек в my1: ");
        for (int i = 0; i < 12; i++) {
            System.out.println(my1.pop());
        }
        System.out.println("стек в my2:");
        for (int i = 0; i < 20; i++) {
            System.out.println(my2.pop());
        }
    }
}
