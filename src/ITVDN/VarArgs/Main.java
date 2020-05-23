package ITVDN.VarArgs;
public class Main {
    private int calcSum(int... values) { // ... - это VarArgs, массив с неопределённым
        // колличеством значений.
        // должен находится последним.
        int result = 0;
        for (int tmp : values) {
            result += tmp;
        }
        return result;
    }
    public static void main(String... args) {
        Main m = new Main();
        System.out.println(m.calcSum(1, 2, 3));
        System.out.println(m.calcSum(1, 2));
        System.out.println(m.calcSum());
    }
}
