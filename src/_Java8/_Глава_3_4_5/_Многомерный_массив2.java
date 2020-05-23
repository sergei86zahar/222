package _Java8._Глава_3_4_5;
public class _Многомерный_массив2 {
    public static void main(String[] args) {
        int w[][] = new int[4][];
        w[0]= new int[3];
        w[1] = new int[8];
        w[2] = new int[9];
        w[3] = new int[6];
        int i, e, k = 0;
        for (i = 0; i < w.length; i++) {
            for (e = 0; e < w[i].length; e++) {
                w[i][e] = k;
                k++;
            }
        }
        for (i = 0; i < w.length; i++) {
            for (e = 0; e < w[i].length; e++) {
                System.out.print(w[i][e] + " ");
            }
            System.out.println();
        }
    }
}
