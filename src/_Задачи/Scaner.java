package _Задачи;
import java.util.Scanner;
public class Scaner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите какое-нибудь число");
        int x = s.nextInt();
        System.out.println("вы ввели" + x);
    }
}
