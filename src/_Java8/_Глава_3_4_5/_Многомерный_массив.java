package _Java8._Глава_3_4_5;
public class _Многомерный_массив {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int[][] matrice = {{1, 2, 3}, {4}, {7, 8, 9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);
        System.out.println(matrice[0][2]);
        int[] number1 = new int[5];
        String[][] w = new String[2][3];
        w[0][1] = "привет";
        System.out.println(w[0][1]);

    }
}
