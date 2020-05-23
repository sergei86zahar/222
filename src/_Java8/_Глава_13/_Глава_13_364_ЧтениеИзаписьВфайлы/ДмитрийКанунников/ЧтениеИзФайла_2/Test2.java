package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.ДмитрийКанунников.ЧтениеИзФайла_2;
import java.util.Scanner;
import java.io.FileInputStream;
public class Test2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new FileInputStream("file.txt"));
        while (scanner.hasNextLine()) { // если у сканера есть строка для чтения
            System.out.println(scanner.nextLine()); // тогда выводим на экран то что
            // прочитали
        }

    }
}
