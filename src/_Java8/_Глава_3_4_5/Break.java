package _Java8._Глава_3_4_5;
public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break; // при срабатывании оператора break мы сразу выходим из цикла
            }
            System.out.println(i);
            i++;
        }
    }
}
