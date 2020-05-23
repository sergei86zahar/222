package _Java8._Глава_3_4_5;
public class for_each_Массивы {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] w = new String[3];
        w[0] = "привет";
        w[1] = "пока";
        w[2] = "джава";
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }
        System.out.println();
        for (String hh : w) {
            System.out.println(hh);
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);
    }
}
