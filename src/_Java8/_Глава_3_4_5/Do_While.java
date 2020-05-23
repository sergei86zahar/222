package _Java8._Глава_3_4_5;
import java.util.Scanner;
public class Do_While {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int s;
        do {
            System.out.println("введите 5");
            s = aa.nextInt();
        } while (s != 5); {
            System.out.println("вы ввели 5");
        }
    }
}

