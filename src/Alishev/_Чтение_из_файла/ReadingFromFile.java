package Alishev._Чтение_из_файла;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "serge" + separator + "Desktop" + separator + "RR";
        File file = new File(path);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {  // Этот метод hasNextLine возвращает true если
            // есть ещё строки которые мы не считали , и возвращает falls если уже нет
            // таких строк.
            System.out.println(scanner.nextLine());
        }
    }
}
