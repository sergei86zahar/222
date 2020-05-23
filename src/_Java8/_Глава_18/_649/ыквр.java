package _Java8._Глава_18._649;
import java.io.IOException;
public class ыквр {
    public static void main(String[] args) {
        try {
            ProcessBuilder sa = new ProcessBuilder("sss");
            sa.start();

        } catch (Exception e) {
            System.out.println("ошибка запуска");
        }
    }
}
