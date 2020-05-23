package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.alishev.ЧтениеИзФайла;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "file.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String input = scanner.nextLine();
        while (scanner.hasNextLine()) {  // Этот метод hasNextLine возвращает true если
            // есть ещё строки которые мы не считали , и возвращает falls если уже нет
            // таких строк.
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
